// =========================================================
    // 5. SEARCH PAGE & HOME MOOD FILTER (LIKE YT MUSIC)
    // =========================================================
    const searchCatalogData = [
      {
        title: 'Lightning Moment (竖琴版)',
        artist: 'TypeD',
        category: 'Music',
        meta: 'Music • TypeD • 3:43',
        duration: '3:43',
        cover: 'https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80',
        isTop: true
      },
      {
        title: 'Lightning Moment - DJ允宏 Remix | Hot T...',
        artist: 'Hyuk5 Remix',
        category: 'Video',
        meta: 'Hyuk5 Remix • 1.6 million views • 2:23',
        duration: '2:23',
        cover: 'https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80',
        isMoreYT: true
      },
      {
        title: 'No Hands x Lightning Moment x 最初的记...',
        artist: 'Wanji Music 2024',
        category: 'Video',
        meta: 'Wanji Music 2024 • 53K views • 5:06',
        duration: '5:06',
        cover: 'https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80',
        isMoreYT: true
      },
      {
        title: 'Lightning Moment - (DJ抖音版2026) 小点...',
        artist: 'TyKang',
        category: 'Video',
        meta: '14 Jan • TyKang',
        duration: '3:18',
        cover: 'https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=300&q=80',
        isMoreYT: true
      },
      {
        title: 'Lightning Moment (with fox capture plan)',
        artist: 'DJ OKAWARI and fox capture plan',
        category: 'Music',
        meta: 'Music • DJ OKAWARI and fox capture plan • Played 2.3 million times',
        duration: '4:12',
        cover: 'https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=300&q=80'
      },
      {
        title: 'Lightning Moment',
        artist: 'NAD1',
        category: 'Music',
        meta: 'Music • NAD1 • Played 610,000 times',
        duration: '3:30',
        cover: 'https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=300&q=80'
      },
      {
        title: 'september lightning (moment with you)',
        artist: 'John Alone',
        category: 'Music',
        explicit: true,
        meta: 'Music • John Alone • Played 180 times',
        duration: '2:54',
        cover: 'https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=300&q=80'
      },
      {
        title: 'DJ OKAWARI feat.fox capture plan「Lightning Moment」',
        artist: 'DJ OKAWARI and Celeina Ann',
        category: 'Video',
        meta: 'Video • DJ OKAWARI and Celeina Ann • 1.5 million views',
        duration: '4:15',
        cover: 'https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=300&q=80'
      },
      {
        title: 'Lightning Moment (再相信一次光吧)',
        artist: 'PPR',
        category: 'Albums',
        isNew: true,
        meta: 'Singles • PPR • 2026',
        duration: '3:48',
        cover: 'https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&w=300&q=80'
      },
      {
        title: 'Every Living Breathing Moment',
        artist: 'Grant Steller',
        category: 'Music',
        meta: 'Music • Grant Steller • Played 8.5 million times',
        duration: '3:22',
        cover: 'https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=300&q=80'
      },
      {
        title: 'Time in a Bottle',
        artist: 'Jim Croce',
        category: 'Music',
        meta: 'Music • Jim Croce • Played 145 million times',
        duration: '2:27',
        cover: 'https://images.unsplash.com/photo-1511379938547-c1f69419868d?auto=format&fit=crop&w=300&q=80'
      },
      {
        title: '✨ Lightning Moment | Harp Version - Giai Điệu Đàn Hạc Giữa Vũ Trụ Huyền Ảo 🌌🎵',
        artist: 'Cosmic Harp',
        category: 'Video',
        meta: 'Video • Cosmic Harp • 420K views',
        duration: '3:59',
        cover: 'https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=300&q=80'
      }
    ];

    let searchSource = 'yt'; // 'yt' | 'library'
    let searchCategory = '';

    const searchTabs = document.querySelectorAll('.search-tab');
    const searchFilterChips = document.querySelectorAll('.s-chip');
    const searchTopShowcase = document.getElementById('searchTopShowcase');
    const searchTopLeft = document.getElementById('searchTopLeft');
    const searchMoreList = document.getElementById('searchMoreList');
    const searchResultsList = document.getElementById('searchResultsList');

    function getCombinedSearchPool() {
      if (searchSource === 'library') {
        return libraryItemsData.map(item => ({
          title: item.title,
          artist: item.subtitle,
          category: item.category === 'เพลง' ? 'Music' : item.category === 'อัลบั้ม' ? 'Albums' : item.category === 'ศิลปิน' ? 'Artist' : item.category === 'พอดแคสต์' ? 'Podcasts' : 'Community playlists',
          meta: item.subtitle,
          duration: item.duration || '3:30',
          audio: item.audio || '',
          cover: item.cover || (item.covers ? item.covers[0] : '')
        }));
      }

      // รวมเพลงจากหน้า Home + searchCatalogData
      const homeCards = Array.from(document.querySelectorAll('#view-home .card, #view-home .track-row')).map(el => ({
        title: el.dataset.title || '',
        artist: el.dataset.artist || '',
        category: 'Music',
        meta: `Music • ${el.dataset.artist || ''}`,
        duration: el.dataset.duration || '3:30',
        audio: el.dataset.audio || '',
        cover: el.dataset.cover || ''
      }));

      return [...searchCatalogData, ...homeCards];
    }

    function renderSearchResults(query) {
      const q = query.trim().toLowerCase();
      switchPageView('search', null);

      const pool = getCombinedSearchPool();
      const matched = pool.filter(item => {
        const matchText = !q || item.title.toLowerCase().includes(q) || item.artist.toLowerCase().includes(q);
        const matchCat = !searchCategory || item.category.toLowerCase() === searchCategory.toLowerCase();
        return matchText && matchCat;
      });

      // จัดการ Top Result + More From YouTube
      const topItem = matched[0];
      const moreYTItems = matched.filter(i => i.isMoreYT).slice(0, 3);
      const fallbackMore = matched.slice(1, 4);
      const rightItems = moreYTItems.length > 0 ? moreYTItems : fallbackMore;

      if (topItem && searchSource === 'yt' && !searchCategory) {
        searchTopShowcase.style.display = 'grid';
        searchTopLeft.innerHTML = `
          <div class="top-result-card playable-item"
               data-title="${topItem.title}"
               data-artist="${topItem.artist}"
               data-duration="${topItem.duration}"
               data-audio="${topItem.audio || ''}"
               data-cover="${topItem.cover}">
            <img src="${topItem.cover}" alt="${topItem.title}" class="top-result-cover">
            <div class="top-result-info">
              <div class="top-result-header">
                <h2 class="top-result-title">${topItem.title}</h2>
                <span class="top-result-dots">⋮</span>
              </div>
              <p class="top-result-meta">${topItem.meta}</p>
              <div class="top-result-actions">
                <button class="btn-play-pill" type="button">▶ Play</button>
                <button class="btn-note-pill" type="button">≡ NOTE</button>
              </div>
            </div>
          </div>
        `;

        searchMoreList.innerHTML = rightItems.map(item => `
          <div class="more-yt-row playable-item"
               data-title="${item.title}"
               data-artist="${item.artist}"
               data-duration="${item.duration}"
               data-audio="${item.audio || ''}"
               data-cover="${item.cover}">
            <img src="${item.cover}" alt="">
            <div class="more-yt-meta">
              <h4>${item.title}</h4>
              <p>${item.meta}</p>
            </div>
          </div>
        `).join('');
      } else {
        searchTopShowcase.style.display = 'none';
      }

      // รายการผลลัพธ์ด้านล่าง
      const listItems = (searchTopShowcase.style.display === 'none')
        ? matched
        : matched.filter(item => item !== topItem && !rightItems.includes(item));

      if (matched.length === 0) {
        searchResultsList.innerHTML = `<div class="search-empty-state">ไม่พบผลลัพธ์สำหรับ "${query}"</div>`;
      } else {
        searchResultsList.innerHTML = listItems.map(item => `
          <div class="search-list-row playable-item"
               data-title="${item.title}"
               data-artist="${item.artist}"
               data-duration="${item.duration}"
               data-audio="${item.audio || ''}"
               data-cover="${item.cover}">
            <img src="${item.cover}" alt="">
            <div class="search-list-meta">
              <h4>${item.title}</h4>
              <p>
                ${item.explicit ? '<span class="explicit-badge">E</span>' : ''}
                ${item.isNew ? '<span class="new-badge">NEW</span>' : ''}
                ${item.meta}
              </p>
            </div>
          </div>
        `).join('');
      }

      bindPlayableEvents();
    }

    // สลับแท็บ YT MUSIC / MUSIC LIBRARY
    searchTabs.forEach(tab => {
      tab.addEventListener('click', () => {
        searchTabs.forEach(t => t.classList.remove('active'));
        tab.classList.add('active');
        searchSource = tab.dataset.searchSource;
        renderSearchResults(searchInput.value);
      });
    });

    // กรองชิปหมวดหมู่ในหน้า Search
    searchFilterChips.forEach(chip => {
      chip.addEventListener('click', () => {
        const cat = chip.dataset.sCat;
        if (searchCategory === cat) {
          searchCategory = '';
          chip.classList.remove('active');
        } else {
          searchCategory = cat;
          searchFilterChips.forEach(c => c.classList.remove('active'));
          chip.classList.add('active');
        }
        renderSearchResults(searchInput.value);
      });
    });

    // Mood Filter เฉพาะหน้า Home
    function applyHomeMoodFilter(mood = '') {
      switchPageView('home', 'home');
      const m = mood.trim().toLowerCase();
      const homeItems = Array.from(document.querySelectorAll('#view-home .card, #view-home .track-row'));

      if (!m) {
        searchBanner.classList.add('hidden');
        homeItems.forEach(el => el.style.display = '');
        document.querySelectorAll('#view-home .content-section').forEach(sec => sec.style.display = '');
        return;
      }

      searchBanner.classList.remove('hidden');
      searchTermDisplay.textContent = `หมวดหมู่: ${mood}`;

      homeItems.forEach(el => {
        const itemMood = (el.dataset.mood || '').toLowerCase();
        el.style.display = itemMood.includes(m) ? '' : 'none';
      });

      document.querySelectorAll('#view-home .content-section').forEach(sec => {
        const visibleItems = Array.from(sec.querySelectorAll('.card, .track-row')).filter(el => el.style.display !== 'none');
        sec.style.display = visibleItems.length > 0 ? '' : 'none';
      });
    }

    clearSearch.addEventListener('click', () => {
      searchInput.value = '';
      clearSearch.style.display = 'none';
      searchCategory = '';
      searchFilterChips.forEach(c => c.classList.remove('active'));
      switchPageView('home', 'home');
      searchInput.focus();
    });

    resetFilterBtn.addEventListener('click', () => {
      searchInput.value = '';
      clearSearch.style.display = 'none';
      moodChips.forEach(c => c.classList.remove('active'));
      applyHomeMoodFilter('');
    });

    moodChips.forEach(chip => {
      chip.addEventListener('click', () => {
        const wasActive = chip.classList.contains('active');
        moodChips.forEach(c => c.classList.remove('active'));
        searchInput.value = '';
        clearSearch.style.display = 'none';
        if (!wasActive) {
          chip.classList.add('active');
          applyHomeMoodFilter(chip.dataset.mood);
        } else {
          applyHomeMoodFilter('');
        }
      });
    });

    // =========================================================
    // 6. SEARCH DROPDOWN (RECENT SEARCHES + SUGGESTIONS)
    // =========================================================
    const RECENT_KEY = 'recentSearches';
    const escHTML = s => String(s ?? '').replace(/[&<>"']/g, c => (
      { '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c]
    ));

    function loadRecent() {
      try { return JSON.parse(localStorage.getItem(RECENT_KEY)) || []; }
      catch { return []; }
    }
    function saveRecent(list) {
      try { localStorage.setItem(RECENT_KEY, JSON.stringify(list)); } catch {}
    }
    function addRecent(entry) {
      if (!entry.title) return;
      const list = loadRecent().filter(r => r.title.toLowerCase() !== entry.title.toLowerCase());
      list.unshift(entry);
      saveRecent(list.slice(0, 8));
    }

    const searchWrap = searchInput.parentElement;
    const searchDropdown = document.createElement('div');
    searchDropdown.id = 'searchDropdown';
    searchDropdown.className = 'search-dropdown hidden';
    searchWrap.appendChild(searchDropdown);

    let ddIndex = -1;

    function ddRowHTML(item, removable) {
      const thumb = item.cover
        ? `<img src="${escHTML(item.cover)}" alt="">`
        : `<span class="sd-icon">🔍</span>`;
      return `
        <div class="sd-row" data-q="${escHTML(item.title)}">
          <div class="sd-thumb">${thumb}</div>
          <div class="sd-meta">
            <div class="sd-title">${escHTML(item.title)}</div>
            <div class="sd-sub">${escHTML(item.artist || '')}</div>
          </div>
          ${removable ? '<button class="sd-remove" type="button" aria-label="Remove">✕</button>' : ''}
        </div>`;
    }

    function hideDropdown() {
      searchDropdown.classList.add('hidden');
      ddIndex = -1;
    }

    function showDropdown() {
      const q = searchInput.value.trim().toLowerCase();
      let html = '';

      if (!q) {
        const recent = loadRecent();
        if (!recent.length) return hideDropdown();
        html = `<div class="sd-header">Recent searches</div>` +
               recent.map(r => ddRowHTML(r, true)).join('');
      } else {
        const sugg = getCombinedSearchPool()
          .filter(i => (i.title || '').toLowerCase().includes(q) || (i.artist || '').toLowerCase().includes(q))
          .slice(0, 6);
        if (!sugg.length) return hideDropdown();
        html = sugg.map(s => ddRowHTML({ ...s, artist: `${s.category} • ${s.artist}` }, false)).join('');
      }

      searchDropdown.innerHTML = html;
      ddIndex = -1;
      searchDropdown.classList.remove('hidden');
    }

    function runSearch(text) {
      searchInput.value = text;
      clearSearch.style.display = text ? 'block' : 'none';
      moodChips.forEach(c => c.classList.remove('active'));
      if (!text.trim()) { switchPageView('home', 'home'); hideDropdown(); return; }
      const hit = getCombinedSearchPool().find(i => (i.title || '').toLowerCase() === text.toLowerCase());
      addRecent(hit
        ? { title: hit.title, artist: `${hit.category} • ${hit.artist}`, cover: hit.cover }
        : { title: text, artist: 'Search', cover: '' });
      renderSearchResults(text);
      hideDropdown();
    }

    // ใช้ mousedown เพื่อไม่ให้ช่องค้นหาเสีย focus ก่อนคลิกทำงาน
    searchDropdown.addEventListener('mousedown', (e) => {
      e.preventDefault();
      const row = e.target.closest('.sd-row');
      if (!row) return;
      if (e.target.closest('.sd-remove')) {
        saveRecent(loadRecent().filter(r => r.title !== row.dataset.q));
        showDropdown();
        return;
      }
      runSearch(row.dataset.q);
      searchInput.blur();
    });

    searchInput.addEventListener('focus', showDropdown);

    searchInput.addEventListener('input', (e) => {
      const val = e.target.value;
      moodChips.forEach(c => c.classList.remove('active'));
      clearSearch.style.display = val ? 'block' : 'none';
      if (!val.trim() && document.getElementById('view-search').classList.contains('active')) {
        switchPageView('home', 'home');
      }
      showDropdown();
    });

    searchInput.addEventListener('keydown', (e) => {
      const rows = [...searchDropdown.querySelectorAll('.sd-row')];
      if (e.key === 'ArrowDown' || e.key === 'ArrowUp') {
        if (!rows.length) return;
        e.preventDefault();
        ddIndex = e.key === 'ArrowDown'
          ? (ddIndex + 1) % rows.length
          : (ddIndex - 1 + rows.length) % rows.length;
        rows.forEach((r, i) => r.classList.toggle('active', i === ddIndex));
      } else if (e.key === 'Enter') {
        const chosen = rows[ddIndex];
        runSearch(chosen ? chosen.dataset.q : searchInput.value);
        searchInput.blur();
      } else if (e.key === 'Escape') {
        hideDropdown();
      }
    });

    document.addEventListener('mousedown', (e) => {
      if (!searchWrap.contains(e.target)) hideDropdown();
    });
