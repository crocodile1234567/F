<!DOCTYPE html>
<html lang="th">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Music - YouTube Music & Spotify Hybrid</title>
  <link rel="stylesheet" href="./css.css">
  <link href="https://fonts.googleapis.com/css2?family=Prompt:wght@300;400;500;600;700&family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
</head>
<body>

  <!-- Top Navigation Bar -->
  <header class="topbar">
    <div class="topbar-left">
      <button class="icon-btn" id="menuToggle" title="เมนู">
        <svg viewBox="0 0 24 24" width="24" height="24" fill="currentColor">
          <path d="M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z"/>
        </svg>
      </button>
      <a href="#" class="logo" id="logoHomeBtn">
        <div class="logo-icon">
          <svg viewBox="0 0 24 24" width="14" height="14" fill="#fff">
            <path d="M8 5v14l11-7z"/>
          </svg>
        </div>
        <span>Music</span>
      </a>
    </div>

    <div class="topbar-center">
      <div class="search-box">
        <svg viewBox="0 0 24 24" width="20" height="20" fill="#888">
          <path d="M15.5 14h-.79l-.28-.27A6.471 6.471 0 0 0 16 9.5 6.5 6.5 0 1 0 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"/>
        </svg>
        <input type="text" id="searchInput" placeholder="Search songs, albums, artists, podcasts">
        <button class="clear-search" id="clearSearch" title="ล้างคำค้นหา">✕</button>
      </div>
    </div>

    <div class="topbar-right">
      <button class="btn-white" id="goToMusicBtn">ไปที่เพลงของคุณ</button>
      <button class="icon-btn" title="เชื่อมต่ออุปกรณ์ (Cast)">
        <svg viewBox="0 0 24 24" width="22" height="22" fill="currentColor">
          <path d="M21 3H3c-1.1 0-2 .9-2 2v3h2V5h18v14h-7v2h7c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM1 18v3h3c0-1.66-1.34-3-3-3zm0-4v2c2.76 0 5 2.24 5 5h2c0-3.87-3.13-7-7-7zm0-4v2c4.97 0 9 4.03 9 9h2c0-6.08-4.93-11-11-11z"/>
        </svg>
      </button>
      <div class="profile-menu-wrap">
        <img src="https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=100&q=80" alt="Profile" class="avatar" id="headerAvatarBtn">

        <!-- Profile Dropdown Menu -->
        <div class="profile-dropdown" id="profileDropdown">
          <div class="profile-dd-header">
            <img src="https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=100&q=80" alt="flowern" class="profile-dd-avatar">
            <div class="profile-dd-info">
              <div class="profile-dd-name" id="ddDisplayName">flowern</div>
              <div class="profile-dd-handle">@Eligrownup</div>
              <a href="#" class="profile-dd-link" id="openProfileFromDd">Manage your Google Account</a>
            </div>
          </div>

          <div class="profile-dd-divider"></div>

          <div class="profile-dd-group">
            <button class="profile-dd-item" id="ddYourChannelBtn">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <rect x="3" y="5" width="18" height="14" rx="2"/>
                <circle cx="9" cy="11" r="2"/>
                <path d="M6 16c.8-1.5 2-2 3-2s2.2.5 3 2"/>
                <line x1="14" y1="10" x2="18" y2="10"/>
                <line x1="14" y1="14" x2="18" y2="14"/>
              </svg>
              <span>Your channel</span>
            </button>
            <button class="profile-dd-item" data-nav-target="upgrade">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <circle cx="12" cy="12" r="9"/>
                <polygon points="10 8.5 16 12 10 15.5 10 8.5" fill="currentColor" stroke="none"/>
              </svg>
              <span>Get Music Premium</span>
            </button>
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <path d="M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2"/>
                <circle cx="9" cy="7" r="4"/>
                <path d="M17 11l2 2 4-4"/>
              </svg>
              <span style="flex:1;">Switch account</span>
              <span style="color:#888;">›</span>
            </button>
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <path d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"/>
                <polyline points="16 17 21 12 16 7"/>
                <line x1="21" y1="12" x2="9" y2="12"/>
              </svg>
              <span>Sign out</span>
            </button>
          </div>

          <div class="profile-dd-divider"></div>

          <div class="profile-dd-group">
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <path d="M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4"/>
                <polyline points="17 8 12 3 7 8"/>
                <line x1="12" y1="3" x2="12" y2="15"/>
              </svg>
              <span>Upload music</span>
            </button>
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <circle cx="12" cy="12" r="9"/>
                <polyline points="12 7 12 12 15 15"/>
              </svg>
              <span>History</span>
            </button>
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <circle cx="12" cy="12" r="3"/>
                <path d="M19.4 15a1.65 1.65 0 0 0 .33 1.82l.06.06a2 2 0 0 1-2.83 2.83l-.06-.06a1.65 1.65 0 0 0-1.82-.33 1.65 1.65 0 0 0-1 1.51V21a2 2 0 0 1-4 0v-.09A1.65 1.65 0 0 0 9 19.4a1.65 1.65 0 0 0-1.82.33l-.06.06a2 2 0 0 1-2.83-2.83l.06-.06a1.65 1.65 0 0 0 .33-1.82 1.65 1.65 0 0 0-1.51-1H3a2 2 0 0 1 0-4h.09A1.65 1.65 0 0 0 4.6 9a1.65 1.65 0 0 0-.33-1.82l-.06-.06a2 2 0 0 1 2.83-2.83l.06.06a1.65 1.65 0 0 0 1.82.33H9a1.65 1.65 0 0 0 1-1.51V3a2 2 0 0 1 4 0v.09a1.65 1.65 0 0 0 1 1.51 1.65 1.65 0 0 0 1.82-.33l.06-.06a2 2 0 0 1 2.83 2.83l-.06.06a1.65 1.65 0 0 0-.33 1.82V9a1.65 1.65 0 0 0 1.51 1H21a2 2 0 0 1 0 4h-.09a1.65 1.65 0 0 0-1.51 1z"/>
              </svg>
              <span>Settings</span>
            </button>
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <circle cx="12" cy="12" r="9"/>
                <line x1="12" y1="8" x2="12" y2="12"/>
                <circle cx="12" cy="16" r="0.8" fill="currentColor"/>
              </svg>
              <span>Terms &amp; privacy policy</span>
            </button>
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <circle cx="12" cy="12" r="9"/>
                <path d="M9.5 9a2.5 2.5 0 0 1 4.7 1c0 1.7-2.2 2.2-2.2 3.8"/>
                <circle cx="12" cy="17" r="0.8" fill="currentColor"/>
              </svg>
              <span>Help</span>
            </button>
            <button class="profile-dd-item">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" stroke-width="1.8">
                <path d="M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z"/>
                <line x1="12" y1="7" x2="12" y2="11"/>
                <circle cx="12" cy="14" r="0.8" fill="currentColor"/>
              </svg>
              <span>Send feedback</span>
            </button>
          </div>
        </div>
      </div>
    </div>
  </header>

  <!-- Main Container -->
  <div class="app-layout">
    <!-- Left Sidebar -->
    <aside class="sidebar" id="sidebar">
      <div class="sidebar-brand">
        <span>Music</span>
      </div>
      <nav class="nav-list">
        <a href="#" class="nav-item active" data-nav="home">
          <svg viewBox="0 0 24 24" width="22" height="22" fill="currentColor">
            <path d="M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z"/>
          </svg>
          <span>Home</span>
        </a>
        <a href="#" class="nav-item" data-nav="explore">
          <svg viewBox="0 0 24 24" width="22" height="22" fill="currentColor">
            <path d="M12 10.9c-.61 0-1.1.49-1.1 1.1s.49 1.1 1.1 1.1c.61 0 1.1-.49 1.1-1.1s-.49-1.1-1.1-1.1zM12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm2.19 12.19L6 18l3.81-8.19L18 6l-3.81 8.19z"/>
          </svg>
          <span>Explore</span>
        </a>
        <a href="#" class="nav-item" data-nav="library">
          <svg viewBox="0 0 24 24" width="22" height="22" fill="currentColor">
            <path d="M4 6H2v14c0 1.1.9 2 2 2h14v-2H4V6zm16-4H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-8 12.5v-9l6 4.5-6 4.5z"/>
          </svg>
          <span>Library</span>
        </a>
        <a href="#" class="nav-item" data-nav="upgrade">
          <svg viewBox="0 0 24 24" width="22" height="22" fill="currentColor">
            <path d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm-2-3.5l6-4.5-6-4.5v9z"/>
          </svg>
          <span>Upgrade</span>
        </a>
      </nav>
    </aside>

    <!-- Main Content Feed -->
    <main class="main-content" id="mainContent">

      <!-- =========================================================
           VIEW 1: HOME PAGE
           ========================================================= -->
      <div id="view-home" class="page-view active">
        <!-- Mood Chips -->
        <div class="mood-chips" id="moodChips">
          <button class="chip" data-mood="Podcasts">Podcasts</button>
          <button class="chip" data-mood="Relax">Relax</button>
          <button class="chip" data-mood="Energize">Energize</button>
          <button class="chip" data-mood="Feel good">Feel good</button>
          <button class="chip" data-mood="Party">Party</button>
          <button class="chip" data-mood="Workout">Workout</button>
          <button class="chip" data-mood="Romance">Romance</button>
          <button class="chip" data-mood="Commute">Commute</button>
          <button class="chip" data-mood="Sad">Sad</button>
          <button class="chip" data-mood="Focus">Focus</button>
          <button class="chip" data-mood="Sleep">Sleep</button>
        </div>

        <!-- Search Results Banner -->
        <div id="searchBanner" class="search-banner hidden">
          <span>ผลการค้นหาสำหรับ: <strong id="searchTermDisplay"></strong></span>
          <button id="resetFilterBtn">แสดงทั้งหมด</button>
        </div>

        <!-- Section 1: Listen again (FLOWERN) -->
        <section class="content-section" data-section="listen-again">
          <div class="section-header">
            <div class="section-title-group">
              <img src="https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=100&q=80" alt="FLOWERN" class="section-avatar">
              <div>
                <span class="section-eyebrow">FLOWERN</span>
                <h2 class="section-title">Listen again</h2>
              </div>
            </div>
            <div class="carousel-controls">
              <button class="circle-btn prev-btn" data-target="row-listen-again">‹</button>
              <button class="circle-btn next-btn" data-target="row-listen-again">›</button>
            </div>
          </div>

          <div class="horizontal-scroll" id="row-listen-again">
            <div class="card card-wide" data-title="Impostor Syndrome" data-artist="Sidney Gish" data-duration="3:42" data-mood="Feel good,Focus" data-audio="./music/impostor-syndrome.mp3" data-cover="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap wide-white">
                <div class="custom-cover-dogs">
                  <span class="handwriting">No Dogs Allowed</span>
                  <span class="handwriting-sub">Sidney Gish</span>
                  <div class="silhouette-art">🚶‍♂️🐕🐕🐕</div>
                </div>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">Sidney Gish - Impostor Syndrome</h3>
              <p class="card-sub">Sidney Gish • No Dogs Allowed</p>
            </div>

            <div class="card card-wide" data-title="นางฟ้า - ETC. x JOEY BOY" data-artist="ETC. x JOEY BOY" data-duration="5:18" data-mood="Romance,Feel good" data-audio="./music/angel-etc-joeyboy.mp3" data-cover="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap">
                <img src="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=500&q=80" alt="ETC x JOEY BOY">
                <div class="cover-badge-text">ETC.<br>BRING</div>
                <span class="duration-tag">5:18</span>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">นางฟ้า - ETC. x JOEY BOY</h3>
              <p class="card-sub">ETC. x JOEY BOY</p>
            </div>

            <div class="card card-wide" data-title="The Wee - Die For Lag & Boat" data-artist="The Wee • Mashup" data-duration="4:12" data-mood="Party,Energize" data-cover="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap">
                <img src="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=500&q=80" alt="The Wee">
                <div class="red-banner-text">บ่าววี</div>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">The Wee - Die For Lag &amp; Boat</h3>
              <p class="card-sub">The Wee • Mashup</p>
            </div>

            <div class="card card-wide" data-title="อันเฟรนด์ (Unfriend)" data-artist="Helmetheads" data-duration="4:35" data-mood="Sad,Commute" data-audio="./music/unfriend.mp3" data-cover="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap">
                <img src="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=500&q=80" alt="Unfriend">
                <span class="duration-tag">4:35</span>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">อันเฟรนด์ (Unfriend)</h3>
              <p class="card-sub">One City Music • 2.5 ล้านวิว • 4 ปีที่แล้ว<br>Helmetheads</p>
            </div>
          </div>
        </section>

        <!-- Section 2: Forgotten favorites -->
        <section class="content-section" data-section="forgotten-favorites">
          <div class="section-header">
            <h2 class="section-title">Forgotten favorites</h2>
            <div class="carousel-controls">
              <button class="circle-btn prev-btn" data-target="row-forgotten">‹</button>
              <button class="circle-btn next-btn" data-target="row-forgotten">›</button>
            </div>
          </div>

          <div class="horizontal-scroll" id="row-forgotten">
            <div class="card card-wide" data-title="Old Memories" data-artist="Various Artists • 800K views" data-duration="3:50" data-mood="Relax,Sleep" data-cover="https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap">
                <img src="https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&w=500&q=80" alt="Old Memories">
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">Old Memories</h3>
              <p class="card-sub">Various Artists • 800K views</p>
            </div>

            <div class="card card-wide" data-title="Anime Hits Playlist" data-artist="J-Pop • 5.2M views" data-duration="4:15" data-mood="Energize,Workout" data-cover="https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap">
                <img src="https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=500&q=80" alt="Anime Hits">
                <div class="anime-badge">LOVE BEAT GIRLS</div>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">Anime Hits Playlist</h3>
              <p class="card-sub">J-Pop • 5.2M views</p>
            </div>

            <div class="card card-wide" data-title="Liked Songs" data-artist="Your playlist" data-duration="3:28" data-mood="Feel good,Commute" data-cover="https://images.unsplash.com/photo-1614613535308-eb5fbd3d2c17?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap liked-gradient">
                <svg viewBox="0 0 24 24" width="54" height="54" fill="none" stroke="#fff" stroke-width="1.6">
                  <path d="M14 9V5a3 3 0 0 0-3-3l-4 9v11h11.28a2 2 0 0 0 2-1.7l1.38-9a2 2 0 0 0-2-2.3zM7 22H4a2 2 0 0 1-2-2v-7a2 2 0 0 1 2-2h3"/>
                </svg>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">Liked Songs</h3>
              <p class="card-sub">Your playlist</p>
            </div>

            <div class="card card-wide" data-title="zero-G" data-artist="Chill Beats • 1.9M views" data-duration="2:58" data-mood="Focus,Relax" data-cover="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap">
                <img src="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=500&q=80" alt="zero-G">
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">zero-G</h3>
              <p class="card-sub">Chill Beats • 1.9M views</p>
            </div>
          </div>
        </section>

        <!-- Section 3: Your daily discover -->
        <section class="content-section" data-section="daily-discover">
          <div class="section-header">
            <h2 class="section-title">Your daily discover</h2>
          </div>

          <div class="horizontal-scroll">
            <div class="card card-square" data-title="If The Sun Burns Out Tonight (ร่วมกับ Oli..." data-artist="VALORANT และ Grabbitz" data-duration="3:44" data-mood="Energize,Workout" data-cover="https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square">
                <img src="https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80" alt="If The Sun Burns Out">
                <span class="dots-menu">⋮</span>
                <button class="play-center-btn">▶</button>
              </div>
              <h3 class="card-title">If The Sun Burns Out Tonight (ร่วมกับ Oli..</h3>
              <p class="card-sub">เพลง • VALORANT และ Grabbitz</p>
            </div>

            <div class="card card-square" data-title="Earrings" data-artist="Malcolm Todd" data-duration="2:49" data-mood="Feel good,Romance" data-cover="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square">
                <img src="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80" alt="Earrings">
                <span class="dots-menu">⋮</span>
                <button class="play-center-btn">▶</button>
              </div>
              <h3 class="card-title">Earrings</h3>
              <p class="card-sub">เพลง • Malcolm Todd</p>
            </div>

            <div class="card card-square" data-title="TVアニメ『ブルーロック』オリジナルサ" data-artist="Jun Murayama" data-duration="3:15" data-mood="Energize,Workout" data-cover="https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square blue-lock">
                <div class="bluelock-crest">BLUELOCK</div>
                <span class="dots-menu">⋮</span>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">TVアニメ『ブルーロック』オリジナルサ</h3>
              <p class="card-sub">อัลบั้ม • Jun Murayama</p>
            </div>

            <div class="card card-square" data-title="TVアニメ『ブルーロック VS. U-20" data-artist="Jun Murayama" data-duration="3:32" data-mood="Energize" data-cover="https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square">
                <img src="https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80" alt="Original Soundtrack">
                <div class="ost-label">ORIGINAL<br>SOUNDTRACK</div>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">TVアニメ『ブルーロック VS. U-20</h3>
              <p class="card-sub">อัลบั้ม • Jun Murayama</p>
            </div>

            <div class="card card-wide" data-title="なとり - Overdose(Acoustic)" data-artist="natori • การดู 22 ล้าน ครั้ง" data-duration="3:20" data-mood="Relax,Sad" data-cover="https://images.unsplash.com/photo-1511379938547-c1f69419868d?auto=format&fit=crop&w=500&q=80">
              <div class="thumb-wrap">
                <img src="https://images.unsplash.com/photo-1511379938547-c1f69419868d?auto=format&fit=crop&w=500&q=80" alt="Overdose">
                <button class="play-center-btn">▶</button>
              </div>
              <h3 class="card-title">なとり - Overdose(Acoustic)</h3>
              <p class="card-sub">natori • การดู 22 ล้าน ครั้ง</p>
            </div>
          </div>
        </section>

        <!-- Section 4: Long listens -->
        <section class="content-section" data-section="long-listens">
          <div class="section-header">
            <h2 class="section-title">Long listens</h2>
            <div class="carousel-controls">
              <button class="circle-btn">‹</button>
              <button class="circle-btn">›</button>
            </div>
          </div>

          <div class="tracks-grid">
            <div class="track-col">
              <div class="track-row" data-title="REMEMBER" data-artist="Masato (coldrain) • Jujutsu Kaisen" data-duration="4:11" data-mood="Energize,Workout" data-cover="https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=150&q=80">
                <img src="https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=150&q=80" alt="REMEMBER">
                <div class="track-info">
                  <h4>REMEMBER</h4>
                  <p>Masato (coldrain) • Jujutsu Kaise...</p>
                </div>
              </div>
              <div class="track-row" data-title="死ぬのがいいわ - Shinunoga E-Wa" data-artist="Fujii Kaze • HELP EVER HURT NEVER" data-duration="3:05" data-mood="Relax,Romance" data-cover="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=150&q=80">
                <img src="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=150&q=80" alt="Shinunoga E-Wa">
                <div class="track-info">
                  <h4>死ぬのがいいわ - Shinunoga E-Wa</h4>
                  <p>Fujii Kaze • เล่น ... • HELP EVER H...</p>
                </div>
              </div>
            </div>

            <div class="track-col">
              <div class="track-row" data-title="Impostor Syndrome" data-artist="Sidney Gish • No Dogs Allowed" data-duration="3:42" data-mood="Focus,Feel good" data-audio="./music/impostor-syndrome.mp3" data-cover="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=150&q=80">
                <img src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=150&q=80" alt="Impostor Syndrome">
                <div class="track-info">
                  <h4>Impostor Syndrome</h4>
                  <p><span class="explicit-badge">E</span> Sidney Gish • เ... • No Dogs All...</p>
                </div>
              </div>
              <div class="track-row" data-title="See You Again (ร่วมกับ Kali Uchis)" data-artist="Tyler, The Creator • Flower Boy" data-duration="3:00" data-mood="Romance,Relax" data-cover="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=150&q=80">
                <img src="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=150&q=80" alt="See You Again">
                <div class="track-info">
                  <h4>See You Again (ร่วมกับ Kali Uchis)</h4>
                  <p><span class="explicit-badge">E</span> Tyler, The Creator • Flower Boy</p>
                </div>
              </div>
            </div>

            <div class="track-col">
              <div class="track-row" data-title="505" data-artist="Arctic Monkeys • Favourite Worst Nightmare" data-duration="4:13" data-mood="Sad,Commute" data-cover="https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&w=150&q=80">
                <img src="https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&w=150&q=80" alt="505">
                <div class="track-info">
                  <h4>505</h4>
                  <p>Arctic Monkeys • Favourite Wor...</p>
                </div>
              </div>
              <div class="track-row" data-title="It's Going Down Now" data-artist="Azumi Takahashi • Persona 3 Reload" data-duration="3:06" data-mood="Energize,Focus" data-cover="https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=150&q=80">
                <img src="https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=150&q=80" alt="Persona 3">
                <div class="track-info">
                  <h4>It's Going Down Now</h4>
                  <p>Azumi Takahashi • Persona 3 Rel...</p>
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>

      <!-- =========================================================
           VIEW 2: EXPLORE MAIN PAGE
           ========================================================= -->
      <div id="view-explore" class="page-view">
        <div class="explore-top-cards">
          <div class="explore-big-card" data-subview="new-releases">
            <svg viewBox="0 0 24 24" width="26" height="26" fill="none" stroke="currentColor" stroke-width="1.8">
              <circle cx="12" cy="12" r="9"/>
              <circle cx="12" cy="12" r="2.5"/>
              <path d="M16 4v4M14 6h4" stroke-linecap="round"/>
            </svg>
            <span>New releases</span>
          </div>

          <div class="explore-big-card" data-subview="charts">
            <svg viewBox="0 0 24 24" width="26" height="26" fill="none" stroke="currentColor" stroke-width="2">
              <polyline points="22 7 13.5 15.5 8.5 10.5 2 17"/>
              <polyline points="16 7 22 7 22 13"/>
            </svg>
            <span>Charts</span>
          </div>

          <div class="explore-big-card" data-subview="moods-genres">
            <svg viewBox="0 0 24 24" width="26" height="26" fill="none" stroke="currentColor" stroke-width="1.8">
              <circle cx="12" cy="12" r="9"/>
              <path d="M8.5 14.5s1.2 2 3.5 2 3.5-2 3.5-2"/>
              <circle cx="9" cy="9.5" r="1" fill="currentColor"/>
              <circle cx="15" cy="9.5" r="1" fill="currentColor"/>
            </svg>
            <span>Moods &amp; genres</span>
          </div>
        </div>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">New albums &amp; singles</h2>
            <div class="carousel-controls-group">
              <button class="more-pill-btn" data-subview="albums-singles">More</button>
              <button class="circle-btn prev-btn" data-target="row-explore-albums">‹</button>
              <button class="circle-btn next-btn" data-target="row-explore-albums">›</button>
            </div>
          </div>

          <div class="horizontal-scroll" id="row-explore-albums">
            <div class="card card-square" data-title="呪術廻戦 懐玉・玉折 OST" data-artist="Album • LoFi Tokyo" data-duration="3:40" data-cover="https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Midnight Horizon" data-artist="Album • LoFi Tokyo" data-duration="3:15" data-cover="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="COME ALIVE" data-artist="Album • LoFi Tokyo" data-duration="3:28" data-cover="https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="OF SNOW AND EMBER" data-artist="Album • LoFi Tokyo" data-duration="4:05" data-cover="https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Neon Wings" data-artist="Album • LoFi Tokyo" data-duration="3:50" data-cover="https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Good Morning Morioh Cho" data-artist="Album • LoFi Tokyo" data-duration="2:55" data-cover="https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
          </div>
        </section>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">Moods &amp; genres</h2>
            <div class="carousel-controls-group">
              <button class="more-pill-btn" data-subview="moods-genres">More</button>
              <button class="circle-btn">‹</button>
              <button class="circle-btn">›</button>
            </div>
          </div>
          <div class="mood-bar-grid cols-6" id="exploreMoodGrid"></div>
        </section>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">Trending</h2>
            <div class="carousel-controls-group">
              <button class="more-pill-btn" data-subview="charts">More</button>
              <button class="circle-btn">‹</button>
              <button class="circle-btn">›</button>
            </div>
          </div>
          <div class="trending-grid" id="exploreTrendingGrid"></div>
        </section>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">New music videos</h2>
            <div class="carousel-controls-group">
              <button class="circle-btn prev-btn" data-target="row-explore-videos">‹</button>
              <button class="circle-btn next-btn" data-target="row-explore-videos">›</button>
            </div>
          </div>

          <div class="horizontal-scroll" id="row-explore-videos">
            <div class="card card-video" data-title="ที่ชอบ - ที่ชอบ (Grief Eaters)" data-artist="Jeff Satur" data-duration="4:18" data-cover="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=600&q=80">
              <div class="thumb-wrap video-thumb">
                <img src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=600&q=80" alt="">
                <button class="play-center-btn">▶</button>
              </div>
              <h3 class="card-title">ที่ชอบ - ที่ชอบ (Grief Eaters)</h3>
              <p class="card-sub">Jeff Satur</p>
            </div>

            <div class="card card-video" data-title="Blue & Lonely (Official MV)" data-artist="Album-LoFi Tokyo" data-duration="3:45" data-cover="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=600&q=80">
              <div class="thumb-wrap video-thumb">
                <img src="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=600&q=80" alt="">
                <button class="play-center-btn">▶</button>
              </div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>

            <div class="card card-video" data-title="เด้อ (Official Video)" data-artist="Album-LoFi Tokyo" data-duration="4:02" data-cover="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=600&q=80">
              <div class="thumb-wrap video-thumb">
                <img src="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=600&q=80" alt="">
                <button class="play-center-btn">▶</button>
              </div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>

            <div class="card card-video" data-title="คนคนนั้น (Official MV)" data-artist="Album-LoFi Tokyo" data-duration="3:55" data-cover="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=600&q=80">
              <div class="thumb-wrap video-thumb">
                <img src="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=600&q=80" alt="">
                <button class="play-center-btn">▶</button>
              </div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
          </div>
        </section>
      </div>

      <!-- =========================================================
           VIEW 3: NEW RELEASES SUB-PAGE
           ========================================================= -->
      <div id="view-new-releases" class="page-view">
        <div class="subpage-breadcrumb">
          <button class="back-pill-btn" data-subview="explore">← Explore</button>
        </div>
        <h1 class="page-hero-title">New releases</h1>

        <div class="single-featured-row">
          <div class="card card-square" data-title="New Release Mix" data-artist="Mix - Youtube Music" data-duration="3:48" data-cover="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80">
            <div class="thumb-wrap square">
              <img src="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80" alt="New Release Mix">
              <button class="play-overlay">▶</button>
            </div>
            <h3 class="card-title">New Release Mix</h3>
            <p class="card-sub">Mix - Youtube Music</p>
          </div>
        </div>

        <section class="content-section" style="margin-top: 38px;">
          <div class="section-header">
            <h2 class="section-title">New albums &amp; singles</h2>
            <div class="carousel-controls-group">
              <button class="more-pill-btn" data-subview="albums-singles">More</button>
              <button class="circle-btn prev-btn" data-target="row-nr-albums">‹</button>
              <button class="circle-btn next-btn" data-target="row-nr-albums">›</button>
            </div>
          </div>

          <div class="horizontal-scroll" id="row-nr-albums">
            <div class="card card-square" data-title="Blue & Lonely (Vol. 1)" data-artist="Album-LoFi Tokyo" data-duration="3:12" data-cover="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Blue & Lonely (Vol. 2)" data-artist="Album-LoFi Tokyo" data-duration="3:25" data-cover="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Blue & Lonely (Vol. 3)" data-artist="Album-LoFi Tokyo" data-duration="2:58" data-cover="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Blue & Lonely (Vol. 4)" data-artist="Album-LoFi Tokyo" data-duration="3:40" data-cover="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Blue & Lonely (Vol. 5)" data-artist="Album-LoFi Tokyo" data-duration="3:19" data-cover="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Blue & Lonely (Vol. 6)" data-artist="Album-LoFi Tokyo" data-duration="3:33" data-cover="https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
          </div>
        </section>
      </div>

      <!-- =========================================================
           VIEW 4: ALBUMS & SINGLES FULL GRID
           ========================================================= -->
      <div id="view-albums-singles" class="page-view">
        <div class="subpage-breadcrumb">
          <button class="back-pill-btn" data-subview="explore">← Explore</button>
        </div>
        <h1 class="page-hero-title">Albums &amp; singles</h1>

        <div class="albums-grid-6" id="albumsFullGrid"></div>
      </div>

      <!-- =========================================================
           VIEW 5: CHARTS SUB-PAGE
           ========================================================= -->
      <div id="view-charts" class="page-view">
        <div class="subpage-breadcrumb">
          <button class="back-pill-btn" data-subview="explore">← Explore</button>
        </div>
        <h1 class="page-hero-title">Charts</h1>

        <div class="country-select-wrap">
          <select id="chartCountrySelect" class="country-dropdown">
            <option value="Thailand">Thailand</option>
            <option value="Global">Global</option>
            <option value="Japan">Japan</option>
            <option value="South Korea">South Korea</option>
          </select>
        </div>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">Video charts</h2>
          </div>

          <div class="horizontal-scroll">
            <div class="card card-square" data-title="Trending 20 Thailand" data-artist="Chart - Youtube Charts" data-duration="3:40" data-cover="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square chart-yellow-card">
                <div class="chart-badge-top">TRENDING<br><strong>20</strong></div>
                <img src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80" alt="" class="chart-inset-img">
                <div class="chart-badge-bottom">THAILAND</div>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">Trending 20 Thailand</h3>
              <p class="card-sub">Chart - Youtube Charts</p>
            </div>

            <div class="card card-square" data-title="Daily Top 100 Music Videos" data-artist="Chart - Youtube Charts" data-duration="3:55" data-cover="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square chart-yellow-card">
                <div class="chart-badge-top"><small>DAILY</small><br>TOP 100<br>VIDEOS</div>
                <img src="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=300&q=80" alt="" class="chart-inset-img">
                <div class="chart-badge-bottom">THAILAND</div>
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="card-title">Daily Top</h3>
              <p class="card-sub">Chart - Youtube Charts</p>
            </div>

            <div class="card card-square" data-title="Top 100 Music Videos Thailand" data-artist="Chart - Youtube Charts" data-duration="4:10" data-cover="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square chart-dark-card">
                <div class="chart-badge-top gold"><small>WEEKLY</small><br>TOP 100<br>VIDEOS</div>
                <img src="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80" alt="" class="chart-inset-img">
                <div class="chart-badge-bottom gold">THAILAND</div>
                <span class="dots-menu">⋮</span>
                <button class="play-overlay" style="opacity:1;">▶</button>
              </div>
              <h3 class="card-title">Top 100 Music Videos Thailand</h3>
              <p class="card-sub">Chart - Youtube Charts</p>
            </div>
          </div>
        </section>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">Top artists</h2>
            <div class="carousel-controls">
              <button class="circle-btn">‹</button>
              <button class="circle-btn">›</button>
            </div>
          </div>
          <div class="top-artists-grid" id="topArtistsGrid"></div>
        </section>
      </div>

      <!-- =========================================================
           VIEW 6: MOODS & GENRES SUB-PAGE
           ========================================================= -->
      <div id="view-moods-genres" class="page-view">
        <div class="subpage-breadcrumb">
          <button class="back-pill-btn" data-subview="explore">← Explore</button>
        </div>
        <h1 class="page-hero-title">Moods &amp; genres</h1>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">For you</h2>
          </div>
          <div class="mood-bar-grid cols-4" id="mgForYouGrid"></div>
        </section>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">Moods &amp; moments</h2>
          </div>
          <div class="mood-bar-grid cols-4" id="mgMomentsGrid"></div>
        </section>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">Genres</h2>
          </div>
          <div class="mood-bar-grid cols-4" id="mgGenresGrid"></div>
        </section>
      </div>

      <!-- =========================================================
           VIEW 7: CATEGORY DETAIL PAGE
           ========================================================= -->
      <div id="view-category-detail" class="page-view">
        <div class="subpage-breadcrumb">
          <button class="back-pill-btn" data-subview="moods-genres">← Moods &amp; genres</button>
        </div>

        <div class="section-header" style="margin-bottom: 10px;">
          <h1 class="page-hero-title" id="categoryDetailTitle" style="margin-bottom: 0;">Thai-pop</h1>
          <div class="carousel-controls">
            <button class="circle-btn">‹</button>
            <button class="circle-btn">›</button>
          </div>
        </div>

        <section class="content-section" style="min-height: 220px;">
          <div class="section-header">
            <h2 class="section-title" style="font-size: 20px;">Song</h2>
          </div>
          <div class="tracks-grid" id="categorySongGrid"></div>
        </section>

        <section class="content-section">
          <div class="section-header">
            <h2 class="section-title">Hot-Hit</h2>
            <div class="carousel-controls-group">
              <button class="more-pill-btn" data-subview="albums-singles">More</button>
              <button class="circle-btn prev-btn" data-target="row-cat-hothit">‹</button>
              <button class="circle-btn next-btn" data-target="row-cat-hothit">›</button>
            </div>
          </div>

          <div class="horizontal-scroll" id="row-cat-hothit">
            <div class="card card-square" data-title="呪術廻戦 懐玉・玉折" data-artist="Album-LoFi Tokyo" data-duration="3:40" data-cover="https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Deep Ocean Drift" data-artist="Album-LoFi Tokyo" data-duration="3:15" data-cover="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="COME ALIVE" data-artist="Album-LoFi Tokyo" data-duration="3:28" data-cover="https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="OF SNOW AND EMBER" data-artist="Album-LoFi Tokyo" data-duration="4:05" data-cover="https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Crystal Phoenix" data-artist="Album-LoFi Tokyo" data-duration="3:50" data-cover="https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
            <div class="card card-square" data-title="Good Morning Morioh Cho" data-artist="Album-LoFi Tokyo" data-duration="2:55" data-cover="https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80">
              <div class="thumb-wrap square"><img src="https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80" alt=""><button class="play-overlay">▶</button></div>
              <h3 class="card-title">Blue &amp; Lonely</h3>
              <p class="card-sub">Album-LoFi Tokyo</p>
            </div>
          </div>
        </section>
      </div>

      <!-- =========================================================
           VIEW 8: LIBRARY PAGE (คลังเพลง)
           ========================================================= -->
      <div id="view-library" class="page-view">
        <div class="library-controls-bar">
          <div class="library-filter-chips" id="libraryFilterChips">
            <button class="lib-clear-btn hidden" id="libClearFilterBtn" title="ล้างตัวกรอง">✕</button>
            <button class="lib-chip" data-lib-cat="เพลย์ลิสต์">เพลย์ลิสต์</button>
            <button class="lib-chip" data-lib-cat="เพลง">เพลง</button>
            <button class="lib-chip" data-lib-cat="อัลบั้ม">อัลบั้ม</button>
            <button class="lib-chip" data-lib-cat="ศิลปิน">ศิลปิน</button>
            <button class="lib-chip" data-lib-cat="โปรไฟล์">โปรไฟล์</button>
            <button class="lib-chip" data-lib-cat="พอดแคสต์">พอดแคสต์</button>
          </div>

          <div class="library-sort-wrap">
            <button class="lib-sort-btn" id="libSortBtn">
              <span id="libSortLabel">รายการที่เพิ่งบันทึกไว้</span>
              <span class="sort-caret">⌄</span>
            </button>
            <div class="lib-sort-menu" id="libSortMenu">
              <div class="lib-sort-header">จัดเรียงตาม</div>
              <button class="lib-sort-option active" data-sort="recent">
                <span class="check-mark">✓</span>
                <span>รายการที่เพิ่งบันทึกไว้</span>
              </button>
              <button class="lib-sort-option" data-sort="asc">
                <span class="check-mark"></span>
                <span>ก ถึง ฮ</span>
              </button>
              <button class="lib-sort-option" data-sort="desc">
                <span class="check-mark"></span>
                <span>ฮ ถึง ก</span>
              </button>
            </div>
          </div>
        </div>

        <div class="library-grid-4" id="libraryItemsGrid"></div>
      </div>

      <!-- =========================================================
           VIEW 9: PROFILE PAGE (flowern)
           ========================================================= -->
      <div id="view-profile" class="page-view">
        <div class="profile-hero-bar">
          <div class="profile-identity">
            <img src="https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=300&q=80" alt="flowern" class="profile-avatar-lg" id="profilePageAvatar">
            <div class="profile-meta-text">
              <h1 class="profile-display-name" id="profilePageName">flowern</h1>
              <p class="profile-subscribers">No subscribers</p>
            </div>
          </div>

          <div class="profile-action-btns">
            <button class="profile-outline-btn" id="editProfileBtn">
              <svg viewBox="0 0 24 24" width="15" height="15" fill="none" stroke="currentColor" stroke-width="2">
                <path d="M12 20h9"/>
                <path d="M16.5 3.5a2.121 2.121 0 0 1 3 3L7 19l-4 1 1-4L16.5 3.5z"/>
              </svg>
              <span>Edit</span>
            </button>
            <button class="profile-outline-btn" id="shareProfileBtn">
              <svg viewBox="0 0 24 24" width="15" height="15" fill="none" stroke="currentColor" stroke-width="2">
                <polyline points="15 17 20 12 15 7"/>
                <path d="M4 18v-2a4 4 0 0 1 4-4h12"/>
              </svg>
              <span>Share</span>
            </button>
          </div>
        </div>

        <div id="profileToast" class="profile-toast hidden">คัดลอกลิงก์โปรไฟล์แล้ว</div>

        <!-- Personal mix Section -->
        <section class="profile-section">
          <h2 class="profile-section-heading">Personal mix</h2>
          <div class="personal-mix-empty">
            <p class="personal-mix-desc">Listen to more music so we can create a radio station that expresses your taste</p>
            <button class="discover-music-btn" id="discoverMusicBtn">
              <svg viewBox="0 0 24 24" width="16" height="16" fill="none" stroke="currentColor" stroke-width="2">
                <path d="M3 10.5L12 3l9 7.5"/>
                <path d="M5 9.5V20h14V9.5"/>
              </svg>
              <span>Discover music</span>
            </button>
          </div>
        </section>

        <!-- PUBLIC Playlists Section -->
        <section class="profile-section">
          <span class="profile-public-label">PUBLIC</span>
          <h2 class="profile-section-heading">Playlists</h2>

          <div class="profile-playlists-row">
            <div class="profile-playlist-card playable-item" data-title="เอาไว้ฟังตอนปั่น" data-artist="Playlist • flowern • 64 views" data-duration="4:18" data-cover="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80">
              <div class="profile-collage-box">
                <img src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80" alt="">
                <img src="https://images.unsplash.com/photo-1507525428034-b723cf961d3e?auto=format&fit=crop&w=300&q=80" alt="">
                <img src="https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=300&q=80" alt="">
                <img src="https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80" alt="">
                <button class="play-overlay">▶</button>
              </div>
              <h3 class="profile-pl-title">เอาไว้ฟังตอนปั่น</h3>
              <p class="profile-pl-sub">Playlist • <span id="plOwnerName">flowern</span> • 64 views</p>
              <span class="profile-pl-badge">4</span>
            </div>
          </div>
        </section>
      </div>

      <!-- Edit Profile Modal -->
      <div class="profile-modal-backdrop" id="editProfileModal">
        <div class="profile-modal-card">
          <div class="profile-modal-header">
            <h3>Edit profile</h3>
            <button class="profile-modal-close" id="closeEditProfileModal">✕</button>
          </div>
          <div class="profile-modal-body">
            <label class="profile-input-label" for="editNameInput">Display name</label>
            <input type="text" id="editNameInput" class="profile-text-input" value="flowern" maxlength="40">

            <label class="profile-input-label" for="editAvatarInput">Avatar URL</label>
            <input type="text" id="editAvatarInput" class="profile-text-input" value="https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=300&q=80">
          </div>
          <div class="profile-modal-footer">
            <button class="profile-outline-btn" id="cancelEditProfileBtn">Cancel</button>
            <button class="btn-white" id="saveEditProfileBtn">Save</button>
          </div>
        </div>
      </div>

      <!-- Site Footer -->
      <footer class="site-footer">
        <div class="footer-top">
          <div class="footer-columns">
            <div class="footer-col">
              <h4>Company</h4>
              <ul>
                <li><a href="#">About</a></li>
                <li><a href="#">Jobs</a></li>
                <li><a href="#">For the Record</a></li>
              </ul>
            </div>

            <div class="footer-col">
              <h4>Communities</h4>
              <ul>
                <li><a href="#">For Artists</a></li>
                <li><a href="#">For Creators</a></li>
                <li><a href="#">For Authors</a></li>
                <li><a href="#">Developers</a></li>
                <li><a href="#">Advertising</a></li>
                <li><a href="#">Investors</a></li>
                <li><a href="#">Vendors</a></li>
              </ul>
            </div>

            <div class="footer-col">
              <h4>Useful links</h4>
              <ul>
                <li><a href="#">Support</a></li>
                <li><a href="#">Free Mobile App</a></li>
                <li><a href="#">Popular by Country</a></li>
                <li><a href="#">Top Song Lyrics</a></li>
                <li><a href="#">Import your music</a></li>
              </ul>
            </div>

            <div class="footer-col">
              <h4>Spotify Plans</h4>
              <ul>
                <li><a href="#">Premium Individual</a></li>
                <li><a href="#">Premium Duo</a></li>
                <li><a href="#">Premium Family</a></li>
                <li><a href="#">Premium Student</a></li>
                <li><a href="#">Spotify Free</a></li>
              </ul>
            </div>
          </div>

          <div class="footer-socials">
            <a href="#" class="social-circle" aria-label="Instagram" title="Instagram">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="currentColor">
                <path d="M7.8 2h8.4C19.4 2 22 4.6 22 7.8v8.4a5.8 5.8 0 0 1-5.8 5.8H7.8C4.6 22 2 19.4 2 16.2V7.8A5.8 5.8 0 0 1 7.8 2zm-.2 2A3.6 3.6 0 0 0 4 7.6v8.8C4 18.39 5.61 20 7.6 20h8.8a3.6 3.6 0 0 0 3.6-3.6V7.6C20 5.61 18.39 4 16.4 4H7.6zm9.65 1.5a1.25 1.25 0 0 1 1.25 1.25A1.25 1.25 0 0 1 17.25 8 1.25 1.25 0 0 1 16 6.75a1.25 1.25 0 0 1 1.25-1.25zM12 7a5 5 0 0 1 5 5 5 5 0 0 1-5 5 5 5 0 0 1-5-5 5 5 0 0 1 5-5zm0 2a3 3 0 0 0-3 3 3 3 0 0 0 3 3 3 3 0 0 0 3-3 3 3 0 0 0-3-3z"/>
              </svg>
            </a>
            <a href="#" class="social-circle" aria-label="X" title="X">
              <svg viewBox="0 0 24 24" width="16" height="16" fill="currentColor">
                <path d="M18.244 2.25h3.308l-7.227 8.26 8.502 11.24H16.17l-5.214-6.817L4.99 21.75H1.68l7.73-8.835L1.254 2.25H8.08l4.713 6.231zm-1.161 17.52h1.833L7.084 4.126H5.117z"/>
              </svg>
            </a>
            <a href="#" class="social-circle" aria-label="Facebook" title="Facebook">
              <svg viewBox="0 0 24 24" width="18" height="18" fill="currentColor">
                <path d="M22 12c0-5.52-4.48-10-10-10S2 6.48 2 12c0 4.84 3.44 8.87 8 9.8V15H8v-3h2V9.5C10 7.57 11.57 6 13.5 6H16v3h-2c-.55 0-1 .45-1 1v2h3v3h-3v6.95c5.05-.5 9-4.76 9-9.95z"/>
              </svg>
            </a>
          </div>
        </div>

        <hr class="footer-divider">

        <div class="footer-bottom">
          <div class="footer-legal-links">
            <a href="#">Legal</a>
            <a href="#">Safety &amp; Privacy Center</a>
            <a href="#">Privacy Policy</a>
            <a href="#">Cookies</a>
            <a href="#">About Ads</a>
            <a href="#">Accessibility</a>
          </div>
          <div class="footer-copyright">
            © 2026 Spotify AB
          </div>
        </div>
      </footer>

    </main>
  </div>

  <!-- Queue Drawer Modal -->
  <div class="queue-drawer" id="queueDrawer">
    <div class="queue-header">
      <h3>พร้อมเล่น (Up Next)</h3>
      <button id="closeQueueBtn">✕</button>
    </div>
    <div class="queue-list" id="queueList"></div>
  </div>

  <!-- Real HTML5 Audio Element -->
  <audio id="audioPlayer" preload="metadata"></audio>

  <!-- Sticky Bottom Player Bar -->
  <footer class="player-bar">
    <div class="player-left">
      <img src="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=100&q=80" alt="Current Track" id="playerCover" class="player-cover">
      <div class="player-meta">
        <div class="player-title" id="playerTitle">นางฟ้า - ETC. x JOEY BOY</div>
        <div class="player-artist" id="playerArtist">ETC. x JOEY BOY</div>
      </div>
      <button class="like-btn" id="likeBtn" title="ถูกใจเพลงนี้">♡</button>
    </div>

    <div class="player-center">
      <div class="player-controls">
        <button class="ctrl-btn" id="prevTrackBtn" title="เพลงก่อนหน้า">⏮</button>
        <button class="play-main-btn" id="playPauseBtn" title="เล่น / หยุดชั่วคราว">▶</button>
        <button class="ctrl-btn" id="nextTrackBtn" title="เพลงถัดไป">⏭</button>
      </div>
      <div class="progress-wrap">
        <span class="time-text" id="currentTimeText">0:00</span>
        <input type="range" id="progressBar" min="0" max="318" value="0" class="progress-slider">
        <span class="time-text" id="durationText">5:18</span>
      </div>
    </div>

    <div class="player-right">
      <button class="queue-toggle-btn" id="toggleQueueBtn">พร้อมเล่น</button>
      <div class="volume-wrap">
        <button class="ctrl-btn" id="muteBtn" title="ปิด/เปิดเสียง">🔊</button>
        <input type="range" id="volumeSlider" min="0" max="100" value="80" class="volume-slider">
      </div>
    </div>
  </footer>

  <script>
    // =========================================================
    // 1. STATE & CORE ELEMENTS
    // =========================================================
    let isPlaying = false;
    let currentSeconds = 0;
    let totalSeconds = 318;

    const menuToggle = document.getElementById('menuToggle');
    const sidebar = document.getElementById('sidebar');
    const searchInput = document.getElementById('searchInput');
    const clearSearch = document.getElementById('clearSearch');
    const searchBanner = document.getElementById('searchBanner');
    const searchTermDisplay = document.getElementById('searchTermDisplay');
    const resetFilterBtn = document.getElementById('resetFilterBtn');
    const moodChips = document.querySelectorAll('.chip');
    const navItems = document.querySelectorAll('.nav-item');
    const pageViews = document.querySelectorAll('.page-view');

    const audioPlayer = document.getElementById('audioPlayer');
    const playerCover = document.getElementById('playerCover');
    const playerTitle = document.getElementById('playerTitle');
    const playerArtist = document.getElementById('playerArtist');
    const playPauseBtn = document.getElementById('playPauseBtn');
    const progressBar = document.getElementById('progressBar');
    const currentTimeText = document.getElementById('currentTimeText');
    const durationText = document.getElementById('durationText');
    const likeBtn = document.getElementById('likeBtn');
    const volumeSlider = document.getElementById('volumeSlider');
    const muteBtn = document.getElementById('muteBtn');
    const toggleQueueBtn = document.getElementById('toggleQueueBtn');
    const queueDrawer = document.getElementById('queueDrawer');
    const closeQueueBtn = document.getElementById('closeQueueBtn');
    const queueList = document.getElementById('queueList');

    // =========================================================
    // 2. DYNAMIC DATA POPULATION FOR EXPLORE & SUB-PAGES
    // =========================================================
    const moodCategories = [
      { name: 'Thai-pop', color: '#26c6da' },
      { name: 'Sleep', color: '#26c6da' },
      { name: 'Chill', color: '#80cbc4' },
      { name: 'Focus', color: '#4dd0e1' },
      { name: 'Workout', color: '#ff7043' },
      { name: 'Party', color: '#ab47bc' },
      { name: 'Romance', color: '#ec407a' },
      { name: 'Sad', color: '#5c6bc0' },
      { name: 'J-Pop', color: '#ef5350' },
      { name: 'K-Pop', color: '#ec407a' },
      { name: 'Indie', color: '#66bb6a' },
      { name: 'Hip-Hop', color: '#ffa726' },
      { name: 'Rock', color: '#e53935' },
      { name: 'R&B', color: '#8e24aa' },
      { name: 'Lo-Fi', color: '#26a69a' },
      { name: 'Commute', color: '#29b6f6' },
      { name: 'Feel good', color: '#ffee58' },
      { name: 'Energize', color: '#ffca28' },
      { name: 'Anime', color: '#7e57c2' },
      { name: 'Acoustic', color: '#8d6e63' },
      { name: 'Jazz', color: '#d4e157' },
      { name: 'Classical', color: '#bdbdbd' },
      { name: 'Luk Thung', color: '#ffb300' },
      { name: 'Electronic', color: '#00e5ff' }
    ];

    function createMoodBarTile(item) {
      const btn = document.createElement('button');
      btn.className = 'mood-bar-tile';
      btn.style.setProperty('--stripe-color', item.color);
      btn.textContent = item.name;
      btn.addEventListener('click', () => openCategoryDetail(item.name));
      return btn;
    }

    const exploreMoodGrid = document.getElementById('exploreMoodGrid');
    moodCategories.forEach(m => exploreMoodGrid.appendChild(createMoodBarTile(m)));

    const mgForYouGrid = document.getElementById('mgForYouGrid');
    moodCategories.slice(0, 6).forEach(m => mgForYouGrid.appendChild(createMoodBarTile(m)));

    const mgMomentsGrid = document.getElementById('mgMomentsGrid');
    moodCategories.slice(1, 12).forEach(m => mgMomentsGrid.appendChild(createMoodBarTile(m)));

    const mgGenresGrid = document.getElementById('mgGenresGrid');
    moodCategories.slice(8, 24).forEach(m => mgGenresGrid.appendChild(createMoodBarTile(m)));

    const trendingCovers = [
      'https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=120&q=80',
      'https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=120&q=80',
      'https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=120&q=80',
      'https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=120&q=80',
      'https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=120&q=80',
      'https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=120&q=80'
    ];
    const exploreTrendingGrid = document.getElementById('exploreTrendingGrid');
    for (let i = 1; i <= 12; i++) {
      const cover = trendingCovers[(i - 1) % trendingCovers.length];
      const item = document.createElement('div');
      item.className = 'trending-item playable-item';
      item.dataset.title = 'เค้า - โจอี้ ภูวศิษฐ์ (JOEY PHUWASIT)';
      item.dataset.artist = 'JOEY PHUWASIT • 43M views';
      item.dataset.duration = '4:15';
      item.dataset.cover = cover;
      item.innerHTML = `
        <img src="${cover}" alt="">
        <span class="trend-rank">${i}</span>
        <div class="trend-meta">
          <h4>เค้า - โจอี้ ภูวศิษฐ์ (JOEY PHUWASIT...</h4>
          <p>JOEY PHUWASIT • 43M views</p>
        </div>
      `;
      exploreTrendingGrid.appendChild(item);
    }

    const albumCovers = [
      'https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80',
      'https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80',
      'https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80',
      'https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80',
      'https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=400&q=80',
      'https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80'
    ];
    const albumsFullGrid = document.getElementById('albumsFullGrid');
    for (let i = 1; i <= 18; i++) {
      const cover = albumCovers[(i - 1) % albumCovers.length];
      const card = document.createElement('div');
      card.className = 'card playable-item';
      card.dataset.title = `Blue & Lonely (Track ${i})`;
      card.dataset.artist = 'Album-LoFi Tokyo';
      card.dataset.duration = '3:24';
      card.dataset.cover = cover;
      card.innerHTML = `
        <div class="thumb-wrap square">
          <img src="${cover}" alt="Blue & Lonely">
          <button class="play-overlay">▶</button>
        </div>
        <h3 class="card-title">Blue &amp; Lonely</h3>
        <p class="card-sub">Album-LoFi Tokyo</p>
      `;
      albumsFullGrid.appendChild(card);
    }

    const topArtistsGrid = document.getElementById('topArtistsGrid');
    for (let i = 1; i <= 9; i++) {
      const avatar = albumCovers[(i - 1) % albumCovers.length];
      const row = document.createElement('div');
      row.className = 'artist-rank-row playable-item';
      row.dataset.title = `GAVIND - Top Hit #${i}`;
      row.dataset.artist = 'GAVIND • 1.98M subscribers';
      row.dataset.duration = '3:45';
      row.dataset.cover = avatar;
      row.innerHTML = `
        <img src="${avatar}" alt="GAVIND">
        <span class="artist-rank-num">1</span>
        <div class="artist-rank-meta">
          <h4>GAVIND</h4>
          <p>1.98M subscribes</p>
        </div>
      `;
      topArtistsGrid.appendChild(row);
    }

    const categorySongGrid = document.getElementById('categorySongGrid');
    function populateCategorySongs(catName) {
      categorySongGrid.innerHTML = `
        <div class="track-col">
          <div class="track-row playable-item" data-title="นางฟ้า - ETC. x JOEY BOY" data-artist="ETC. x JOEY BOY • ${catName}" data-duration="5:18" data-audio="./music/angel-etc-joeyboy.mp3" data-cover="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=150&q=80">
            <img src="https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=150&q=80" alt="">
            <div class="track-info"><h4>นางฟ้า - ETC. x JOEY BOY</h4><p>ETC. x JOEY BOY • ${catName}</p></div>
          </div>
          <div class="track-row playable-item" data-title="อันเฟรนด์ (Unfriend)" data-artist="Helmetheads • ${catName}" data-duration="4:35" data-audio="./music/unfriend.mp3" data-cover="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=150&q=80">
            <img src="https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=150&q=80" alt="">
            <div class="track-info"><h4>อันเฟรนด์ (Unfriend)</h4><p>Helmetheads • ${catName}</p></div>
          </div>
        </div>
        <div class="track-col">
          <div class="track-row playable-item" data-title="ความเชื่อ (ร่วมกับ แอ๊ด คาราบาว)" data-artist="บอดี้สแลม • ${catName}" data-duration="4:50" data-cover="https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad?auto=format&fit=crop&w=150&q=80">
            <img src="https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad?auto=format&fit=crop&w=150&q=80" alt="">
            <div class="track-info"><h4>ความเชื่อ (ร่วมกับ แอ๊ด คาราบาว)</h4><p>บอดี้สแลม • ${catName}</p></div>
          </div>
          <div class="track-row playable-item" data-title="ที่ชอบ - ที่ชอบ (Grief Eaters)" data-artist="Jeff Satur • ${catName}" data-duration="4:18" data-cover="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=150&q=80">
            <img src="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=150&q=80" alt="">
            <div class="track-info"><h4>ที่ชอบ - ที่ชอบ (Grief Eaters)</h4><p>Jeff Satur • ${catName}</p></div>
          </div>
        </div>
      `;
      bindPlayableEvents();
    }

    // =========================================================
    // 2.5 LIBRARY PAGE DATA & INTERACTION
    // =========================================================
    const libraryItemsData = [
      {
        id: 1,
        title: 'Liked Songs',
        subtitle: 'เพลย์ลิสต์ • เพลงที่ถูกใจ',
        category: 'เพลย์ลิสต์',
        type: 'liked',
        savedOrder: 1,
        duration: '3:28',
        cover: 'https://images.unsplash.com/photo-1614613535308-eb5fbd3d2c17?auto=format&fit=crop&w=400&q=80'
      },
      {
        id: 2,
        title: 'Bad - Michael Jackson',
        subtitle: 'อัลบั้ม • Michael Jackson',
        category: 'อัลบั้ม',
        type: 'square',
        savedOrder: 2,
        duration: '4:07',
        cover: 'https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80'
      },
      {
        id: 3,
        title: 'Heavy Metal & Rock Mix',
        subtitle: 'เพลย์ลิสต์ • เพลงร็อกและเมทัล',
        category: 'เพลย์ลิสต์',
        type: 'grid',
        savedOrder: 3,
        duration: '4:42',
        covers: [
          'https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=300&q=80'
        ]
      },
      {
        id: 4,
        title: 'J-Pop & Anime Essentials',
        subtitle: 'เพลย์ลิสต์ • เพลงอนิเมะยอดฮิต',
        category: 'เพลย์ลิสต์',
        type: 'grid',
        savedOrder: 4,
        duration: '3:55',
        covers: [
          'https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=300&q=80'
        ]
      },
      {
        id: 5,
        title: 'Sabrina Carpenter',
        subtitle: 'ศิลปิน • ผู้ติดตาม 12.4 ล้านคน',
        category: 'ศิลปิน',
        type: 'circle',
        savedOrder: 5,
        duration: '3:12',
        cover: 'https://images.unsplash.com/photo-1534528741775-53994a69daeb?auto=format&fit=crop&w=400&q=80'
      },
      {
        id: 6,
        title: 'Classic Rock Anthems',
        subtitle: 'เพลย์ลิสต์ • Queen & Legends',
        category: 'เพลย์ลิสต์',
        type: 'grid',
        savedOrder: 6,
        duration: '5:55',
        covers: [
          'https://images.unsplash.com/photo-1511379938547-c1f69419868d?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&w=300&q=80'
        ]
      },
      {
        id: 7,
        title: 'HoneyWorks & Vocaloid Mix',
        subtitle: 'เพลย์ลิสต์ • J-Pop',
        category: 'เพลย์ลิสต์',
        type: 'grid',
        savedOrder: 7,
        duration: '4:10',
        covers: [
          'https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80'
        ]
      },
      {
        id: 8,
        title: 'Alternative & Punk Favorites',
        subtitle: 'เพลย์ลิสต์ • My Chemical Romance & Green Day',
        category: 'เพลย์ลิสต์',
        type: 'grid',
        savedOrder: 8,
        duration: '3:48',
        covers: [
          'https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=300&q=80',
          'https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=300&q=80'
        ]
      },
      {
        id: 9,
        title: 'นางฟ้า - ETC. x JOEY BOY',
        subtitle: 'เพลง • ETC. x JOEY BOY',
        category: 'เพลง',
        type: 'square',
        savedOrder: 9,
        duration: '5:18',
        audio: './music/angel-etc-joeyboy.mp3',
        cover: 'https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80'
      },
      {
        id: 10,
        title: 'Impostor Syndrome',
        subtitle: 'เพลง • Sidney Gish',
        category: 'เพลง',
        type: 'square',
        savedOrder: 10,
        duration: '3:42',
        audio: './music/impostor-syndrome.mp3',
        cover: 'https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80'
      },
      {
        id: 11,
        title: 'FLOWERN',
        subtitle: 'โปรไฟล์ • ผู้ติดตาม 420 คน',
        category: 'โปรไฟล์',
        type: 'circle',
        savedOrder: 11,
        duration: '3:15',
        cover: 'https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=400&q=80'
      },
      {
        id: 12,
        title: 'The Secret Sauce Podcast',
        subtitle: 'พอดแคสต์ • THE STANDARD',
        category: 'พอดแคสต์',
        type: 'square',
        savedOrder: 12,
        duration: '42:10',
        cover: 'https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80'
      }
    ];

    let activeLibCategory = '';
    let activeLibSort = 'recent';

    const libraryItemsGrid = document.getElementById('libraryItemsGrid');
    const libFilterChips = document.querySelectorAll('.lib-chip');
    const libClearFilterBtn = document.getElementById('libClearFilterBtn');
    const libSortBtn = document.getElementById('libSortBtn');
    const libSortMenu = document.getElementById('libSortMenu');
    const libSortLabel = document.getElementById('libSortLabel');
    const libSortOptions = document.querySelectorAll('.lib-sort-option');

    function renderLibraryGrid() {
      let filtered = libraryItemsData.filter(item => {
        return !activeLibCategory || item.category === activeLibCategory;
      });

      if (activeLibSort === 'asc') {
        filtered.sort((a, b) => a.title.localeCompare(b.title, 'th'));
      } else if (activeLibSort === 'desc') {
        filtered.sort((a, b) => b.title.localeCompare(a.title, 'th'));
      } else {
        filtered.sort((a, b) => a.savedOrder - b.savedOrder);
      }

      libraryItemsGrid.innerHTML = '';

      filtered.forEach(item => {
        const card = document.createElement('div');
        card.className = 'lib-card playable-item';
        card.dataset.title = item.title;
        card.dataset.artist = item.subtitle;
        card.dataset.duration = item.duration;
        if (item.audio) card.dataset.audio = item.audio;

        const mainCover = item.cover || (item.covers ? item.covers[0] : '');
        card.dataset.cover = mainCover;

        let thumbInner = '';
        if (item.type === 'liked') {
          thumbInner = `
            <div class="lib-thumb liked-gradient">
              <svg viewBox="0 0 24 24" width="64" height="64" fill="#ffffff">
                <path d="M1 21h4V9H1v12zm22-11c0-1.1-.9-2-2-2h-6.31l.95-4.57.03-.32c0-.41-.17-.79-.44-1.06L14.17 1 7.59 7.59C7.22 7.95 7 8.45 7 9v10c0 1.1.9 2 2 2h9c.83 0 1.54-.5 1.84-1.22l3.02-7.05c.09-.23.14-.47.14-.73v-2z"/>
              </svg>
              <button class="play-overlay">▶</button>
            </div>
          `;
        } else if (item.type === 'grid' && item.covers) {
          thumbInner = `
            <div class="lib-thumb lib-collage-grid">
              <img src="${item.covers[0]}" alt="">
              <img src="${item.covers[1]}" alt="">
              <img src="${item.covers[2]}" alt="">
              <img src="${item.covers[3]}" alt="">
              <button class="play-overlay">▶</button>
            </div>
          `;
        } else if (item.type === 'circle') {
          thumbInner = `
            <div class="lib-thumb lib-circle">
              <img src="${mainCover}" alt="${item.title}">
              <button class="play-overlay">▶</button>
            </div>
          `;
        } else {
          thumbInner = `
            <div class="lib-thumb">
              <img src="${mainCover}" alt="${item.title}">
              <button class="play-overlay">▶</button>
            </div>
          `;
        }

        card.innerHTML = `
          ${thumbInner}
          <h3 class="lib-card-title">${item.title}</h3>
          <p class="lib-card-sub">${item.subtitle}</p>
        `;
        libraryItemsGrid.appendChild(card);
      });

      bindPlayableEvents();
    }

    libFilterChips.forEach(chip => {
      chip.addEventListener('click', () => {
        const selectedCat = chip.dataset.libCat;
        if (activeLibCategory === selectedCat) {
          resetLibraryFilter();
        } else {
          activeLibCategory = selectedCat;
          libClearFilterBtn.classList.remove('hidden');
          libFilterChips.forEach(c => {
            if (c.dataset.libCat === selectedCat) {
              c.classList.add('active');
              c.style.display = '';
            } else {
              c.classList.remove('active');
              c.style.display = 'none';
            }
          });
          renderLibraryGrid();
        }
      });
    });

    function resetLibraryFilter() {
      activeLibCategory = '';
      libClearFilterBtn.classList.add('hidden');
      libFilterChips.forEach(c => {
        c.classList.remove('active');
        c.style.display = '';
      });
      renderLibraryGrid();
    }

    libClearFilterBtn.addEventListener('click', resetLibraryFilter);

    libSortBtn.addEventListener('click', (e) => {
      e.stopPropagation();
      libSortMenu.classList.toggle('open');
    });

    document.addEventListener('click', (e) => {
      if (!libSortMenu.contains(e.target) && !libSortBtn.contains(e.target)) {
        libSortMenu.classList.remove('open');
      }
      if (!profileDropdown.contains(e.target) && !headerAvatarBtn.contains(e.target)) {
        profileDropdown.classList.remove('open');
      }
    });

    libSortOptions.forEach(opt => {
      opt.addEventListener('click', () => {
        activeLibSort = opt.dataset.sort;
        libSortLabel.textContent = opt.querySelector('span:last-child').textContent;

        libSortOptions.forEach(o => {
          o.classList.remove('active');
          o.querySelector('.check-mark').textContent = '';
        });
        opt.classList.add('active');
        opt.querySelector('.check-mark').textContent = '✓';

        libSortMenu.classList.remove('open');
        renderLibraryGrid();
      });
    });

    // =========================================================
    // 2.8 PROFILE DROPDOWN & PROFILE PAGE INTERACTION
    // =========================================================
    const headerAvatarBtn = document.getElementById('headerAvatarBtn');
    const profileDropdown = document.getElementById('profileDropdown');
    const ddYourChannelBtn = document.getElementById('ddYourChannelBtn');
    const openProfileFromDd = document.getElementById('openProfileFromDd');
    const editProfileBtn = document.getElementById('editProfileBtn');
    const shareProfileBtn = document.getElementById('shareProfileBtn');
    const discoverMusicBtn = document.getElementById('discoverMusicBtn');
    const profileToast = document.getElementById('profileToast');

    const editProfileModal = document.getElementById('editProfileModal');
    const closeEditProfileModal = document.getElementById('closeEditProfileModal');
    const cancelEditProfileBtn = document.getElementById('cancelEditProfileBtn');
    const saveEditProfileBtn = document.getElementById('saveEditProfileBtn');
    const editNameInput = document.getElementById('editNameInput');
    const editAvatarInput = document.getElementById('editAvatarInput');

    const profilePageName = document.getElementById('profilePageName');
    const profilePageAvatar = document.getElementById('profilePageAvatar');
    const ddDisplayName = document.getElementById('ddDisplayName');
    const plOwnerName = document.getElementById('plOwnerName');
    const ddAvatar = document.querySelector('.profile-dd-avatar');

    headerAvatarBtn.addEventListener('click', (e) => {
      e.stopPropagation();
      profileDropdown.classList.toggle('open');
    });

    function goToProfilePage() {
      profileDropdown.classList.remove('open');
      switchPageView('profile', null);
    }

    ddYourChannelBtn.addEventListener('click', goToProfilePage);
    openProfileFromDd.addEventListener('click', (e) => {
      e.preventDefault();
      goToProfilePage();
    });

    discoverMusicBtn.addEventListener('click', () => {
      switchPageView('home', 'home');
    });

    shareProfileBtn.addEventListener('click', () => {
      const url = window.location.href;
      if (navigator.clipboard && navigator.clipboard.writeText) {
        navigator.clipboard.writeText(url).catch(() => {});
      }
      profileToast.classList.remove('hidden');
      setTimeout(() => {
        profileToast.classList.add('hidden');
      }, 2400);
    });

    editProfileBtn.addEventListener('click', () => {
      editNameInput.value = profilePageName.textContent.trim();
      editAvatarInput.value = profilePageAvatar.src;
      editProfileModal.classList.add('open');
    });

    function closeEditModal() {
      editProfileModal.classList.remove('open');
    }

    closeEditProfileModal.addEventListener('click', closeEditModal);
    cancelEditProfileBtn.addEventListener('click', closeEditModal);
    editProfileModal.addEventListener('click', (e) => {
      if (e.target === editProfileModal) closeEditModal();
    });

    saveEditProfileBtn.addEventListener('click', () => {
      const nextName = editNameInput.value.trim() || 'flowern';
      const nextAvatar = editAvatarInput.value.trim() || profilePageAvatar.src;

      profilePageName.textContent = nextName;
      ddDisplayName.textContent = nextName;
      plOwnerName.textContent = nextName;

      profilePageAvatar.src = nextAvatar;
      headerAvatarBtn.src = nextAvatar;
      if (ddAvatar) ddAvatar.src = nextAvatar;

      closeEditModal();
    });

    // =========================================================
    // 3. VIEW NAVIGATION ROUTING
    // =========================================================
    function switchPageView(viewId, navKey = null) {
      pageViews.forEach(v => v.classList.remove('active'));
      const targetView = document.getElementById(`view-${viewId}`);
      if (targetView) targetView.classList.add('active');

      navItems.forEach(n => n.classList.remove('active'));
      if (navKey) {
        const activeNav = document.querySelector(`.nav-item[data-nav="${navKey}"]`);
        if (activeNav) activeNav.classList.add('active');
      }
      window.scrollTo({ top: 0, behavior: 'smooth' });
    }

    function openCategoryDetail(categoryName) {
      document.getElementById('categoryDetailTitle').textContent = categoryName;
      populateCategorySongs(categoryName);
      switchPageView('category-detail', 'explore');
    }

    navItems.forEach(item => {
      item.addEventListener('click', (e) => {
        e.preventDefault();
        const nav = item.dataset.nav;
        if (nav === 'explore') {
          switchPageView('explore', 'explore');
        } else if (nav === 'home') {
          switchPageView('home', 'home');
        } else if (nav === 'library') {
          switchPageView('library', 'library');
        } else {
          switchPageView('home', nav);
        }
      });
    });

    document.getElementById('logoHomeBtn').addEventListener('click', (e) => {
      e.preventDefault();
      switchPageView('home', 'home');
    });

    document.querySelectorAll('[data-subview]').forEach(el => {
      el.addEventListener('click', () => {
        const sub = el.dataset.subview;
        switchPageView(sub, 'explore');
      });
    });

    // =========================================================
    // 4. REAL AUDIO PLAYER & INTERACTIVE CONTROLS
    // =========================================================
    let allPlayableNodes = [];
    let currentIndex = 1;

    function bindPlayableEvents() {
      allPlayableNodes = Array.from(document.querySelectorAll('.card, .track-row, .playable-item'));
      allPlayableNodes.forEach((node, idx) => {
        node.onclick = () => loadTrack(idx, true);
      });
      renderQueue();
    }

    menuToggle.addEventListener('click', () => {
      sidebar.classList.toggle('expanded');
    });

    function parseDuration(str) {
      if (!str) return 210;
      const parts = str.split(':').map(Number);
      return parts[0] * 60 + (parts[1] || 0);
    }

    function formatTime(sec) {
      const m = Math.floor(sec / 60);
      const s = Math.floor(sec % 60);
      return `${m}:${s < 10 ? '0' : ''}${s}`;
    }

    audioPlayer.volume = volumeSlider.value / 100;

    function loadTrack(index, autoPlay = true) {
      if (allPlayableNodes.length === 0) return;
      if (index < 0) index = allPlayableNodes.length - 1;
      if (index >= allPlayableNodes.length) index = 0;
      currentIndex = index;

      const el = allPlayableNodes[index];
      const title = el.dataset.title || 'Unknown Track';
      const artist = el.dataset.artist || 'Unknown Artist';
      const durStr = el.dataset.duration || '0:00';
      const cover = el.dataset.cover || 'https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=100&q=80';
      const audioSrc = el.dataset.audio || '';

      playerTitle.textContent = title;
      playerArtist.textContent = artist;
      playerCover.src = cover;

      audioPlayer.src = audioSrc;
      totalSeconds = parseDuration(durStr);
      currentSeconds = 0;
      progressBar.max = totalSeconds;
      progressBar.value = 0;
      currentTimeText.textContent = '0:00';
      durationText.textContent = durStr;

      renderQueue();
      if (autoPlay && audioSrc) {
        startPlayback();
      } else {
        pausePlayback();
      }
    }

    function startPlayback() {
      if (!audioPlayer.getAttribute('src')) return;
      audioPlayer.play().then(() => {
        isPlaying = true;
        playPauseBtn.textContent = '❚❚';
      }).catch(() => {
        isPlaying = false;
        playPauseBtn.textContent = '▶';
      });
    }

    function pausePlayback() {
      audioPlayer.pause();
      isPlaying = false;
      playPauseBtn.textContent = '▶';
    }

    playPauseBtn.addEventListener('click', () => {
      if (isPlaying) {
        pausePlayback();
      } else if (audioPlayer.getAttribute('src')) {
        startPlayback();
      } else {
        loadTrack(currentIndex, true);
      }
    });

    document.getElementById('prevTrackBtn').addEventListener('click', () => loadTrack(currentIndex - 1, true));
    document.getElementById('nextTrackBtn').addEventListener('click', () => loadTrack(currentIndex + 1, true));

    audioPlayer.addEventListener('loadedmetadata', () => {
      if (!isNaN(audioPlayer.duration) && isFinite(audioPlayer.duration)) {
        totalSeconds = Math.floor(audioPlayer.duration);
        progressBar.max = totalSeconds;
        durationText.textContent = formatTime(totalSeconds);
      }
    });

    audioPlayer.addEventListener('timeupdate', () => {
      currentSeconds = Math.floor(audioPlayer.currentTime);
      progressBar.value = currentSeconds;
      currentTimeText.textContent = formatTime(currentSeconds);
    });

    audioPlayer.addEventListener('ended', () => {
      loadTrack(currentIndex + 1, true);
    });

    progressBar.addEventListener('input', (e) => {
      const targetSec = Number(e.target.value);
      audioPlayer.currentTime = targetSec;
      currentSeconds = targetSec;
      currentTimeText.textContent = formatTime(currentSeconds);
    });

    likeBtn.addEventListener('click', () => {
      likeBtn.classList.toggle('liked');
      likeBtn.textContent = likeBtn.classList.contains('liked') ? '♥' : '♡';
    });

    let lastVolume = 80;
    volumeSlider.addEventListener('input', (e) => {
      const v = Number(e.target.value);
      audioPlayer.volume = v / 100;
      audioPlayer.muted = v === 0;
      muteBtn.textContent = v === 0 ? '🔇' : v < 50 ? '🔉' : '🔊';
    });

    muteBtn.addEventListener('click', () => {
      if (Number(volumeSlider.value) > 0) {
        lastVolume = volumeSlider.value;
        volumeSlider.value = 0;
        audioPlayer.volume = 0;
        audioPlayer.muted = true;
        muteBtn.textContent = '🔇';
      } else {
        const restore = lastVolume || 80;
        volumeSlider.value = restore;
        audioPlayer.volume = restore / 100;
        audioPlayer.muted = false;
        muteBtn.textContent = '🔊';
      }
    });

    function renderQueue() {
      queueList.innerHTML = '';
      allPlayableNodes.slice(0, 12).forEach((node, idx) => {
        const item = document.createElement('div');
        item.className = 'queue-item' + (idx === currentIndex ? ' active' : '');
        item.innerHTML = `
          <img src="${node.dataset.cover}" alt="">
          <div class="q-meta">
            <div class="q-title">${node.dataset.title}</div>
            <div class="q-artist">${node.dataset.artist}</div>
          </div>
          <span class="q-dur">${node.dataset.duration}</span>
        `;
        item.addEventListener('click', () => loadTrack(idx, true));
        queueList.appendChild(item);
      });
    }

    toggleQueueBtn.addEventListener('click', () => queueDrawer.classList.toggle('open'));
    closeQueueBtn.addEventListener('click', () => queueDrawer.classList.remove('open'));

    document.querySelectorAll('.prev-btn, .next-btn').forEach(btn => {
      btn.addEventListener('click', () => {
        const container = document.getElementById(btn.dataset.target);
        if (!container) return;
        const direction = btn.classList.contains('next-btn') ? 1 : -1;
        container.scrollBy({ left: direction * 640, behavior: 'smooth' });
      });
    });

    document.addEventListener('DOMContentLoaded', () => {
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
    });

    document.getElementById('goToMusicBtn').addEventListener('click', () => {
      switchPageView('library', 'library');
    });

    // Initialize Library & Playable Items
    renderLibraryGrid();
    bindPlayableEvents();
  </script>
</body>
</html>

<section class="content-section">
      <div class="section-header">
        <h2 class="section-title">Moods &amp; genres</h2>
        <div class="carousel-controls-group">
          <button class="more-pill-btn" data-subview="moods-genres">More</button>
          <button class="circle-btn">‹</button>
          <button class="circle-btn">›</button>
        </div>
      </div>
      <div class="mood-bar-grid cols-6" id="exploreMoodGrid"></div>
    </section>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">Trending</h2>
        <div class="carousel-controls-group">
          <button class="more-pill-btn" data-subview="charts">More</button>
          <button class="circle-btn">‹</button>
          <button class="circle-btn">›</button>
        </div>
      </div>
      <div class="trending-grid" id="exploreTrendingGrid"></div>
    </section>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">New music videos</h2>
        <div class="carousel-controls-group">
          <button class="circle-btn prev-btn" data-target="row-explore-videos">‹</button>
          <button class="circle-btn next-btn" data-target="row-explore-videos">›</button>
        </div>
      </div>

      <div class="horizontal-scroll" id="row-explore-videos">
        <div class="card card-video" data-title="ที่ชอบ - ที่ชอบ (Grief Eaters)" data-artist="Jeff Satur" data-duration="4:18" data-cover="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=600&q=80)">
          <div class="thumb-wrap video-thumb">
            <img src="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=600&q=80)" alt="">
            <button class="play-center-btn">▶</button>
          </div>
          <h3 class="card-title">ที่ชอบ - ที่ชอบ (Grief Eaters)</h3>
          <p class="card-sub">Jeff Satur</p>
        </div>

        <div class="card card-video" data-title="Blue & Lonely (Official MV)" data-artist="Album-LoFi Tokyo" data-duration="3:45" data-cover="[https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=600&q=80)">
          <div class="thumb-wrap video-thumb">
            <img src="[https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=600&q=80)" alt="">
            <button class="play-center-btn">▶</button>
          </div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>

        <div class="card card-video" data-title="เด้อ (Official Video)" data-artist="Album-LoFi Tokyo" data-duration="4:02" data-cover="[https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=600&q=80)">
          <div class="thumb-wrap video-thumb">
            <img src="[https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=600&q=80)" alt="">
            <button class="play-center-btn">▶</button>
          </div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>

        <div class="card card-video" data-title="คนคนนั้น (Official MV)" data-artist="Album-LoFi Tokyo" data-duration="3:55" data-cover="[https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=600&q=80)">
          <div class="thumb-wrap video-thumb">
            <img src="[https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=600&q=80](https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=600&q=80)" alt="">
            <button class="play-center-btn">▶</button>
          </div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
      </div>
    </section>
  </div>

  <!-- =========================================================
       VIEW 3: NEW RELEASES SUB-PAGE
       ========================================================= -->
  <div id="view-new-releases" class="page-view">
    <div class="subpage-breadcrumb">
      <button class="back-pill-btn" data-subview="explore">← Explore</button>
    </div>
    <h1 class="page-hero-title">New releases</h1>

    <div class="single-featured-row">
      <div class="card card-square" data-title="New Release Mix" data-artist="Mix - Youtube Music" data-duration="3:48" data-cover="[https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80)">
        <div class="thumb-wrap square">
          <img src="[https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80)" alt="New Release Mix">
          <button class="play-overlay">▶</button>
        </div>
        <h3 class="card-title">New Release Mix</h3>
        <p class="card-sub">Mix - Youtube Music</p>
      </div>
    </div>

    <section class="content-section" style="margin-top: 38px;">
      <div class="section-header">
        <h2 class="section-title">New albums &amp; singles</h2>
        <div class="carousel-controls-group">
          <button class="more-pill-btn" data-subview="albums-singles">More</button>
          <button class="circle-btn prev-btn" data-target="row-nr-albums">‹</button>
          <button class="circle-btn next-btn" data-target="row-nr-albums">›</button>
        </div>
      </div>

      <div class="horizontal-scroll" id="row-nr-albums">
        <div class="card card-square" data-title="Blue & Lonely (Vol. 1)" data-artist="Album-LoFi Tokyo" data-duration="3:12" data-cover="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Blue & Lonely (Vol. 2)" data-artist="Album-LoFi Tokyo" data-duration="3:25" data-cover="[https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Blue & Lonely (Vol. 3)" data-artist="Album-LoFi Tokyo" data-duration="2:58" data-cover="[https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Blue & Lonely (Vol. 4)" data-artist="Album-LoFi Tokyo" data-duration="3:40" data-cover="[https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1470225620780-dba8ba36b745?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Blue & Lonely (Vol. 5)" data-artist="Album-LoFi Tokyo" data-duration="3:19" data-cover="[https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Blue & Lonely (Vol. 6)" data-artist="Album-LoFi Tokyo" data-duration="3:33" data-cover="[https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1550745165-9bc0b252726f?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
      </div>
    </section>
  </div>

  <!-- =========================================================
       VIEW 4: ALBUMS & SINGLES FULL GRID
       ========================================================= -->
  <div id="view-albums-singles" class="page-view">
    <div class="subpage-breadcrumb">
      <button class="back-pill-btn" data-subview="explore">← Explore</button>
    </div>
    <h1 class="page-hero-title">Albums &amp; singles</h1>

    <div class="albums-grid-6" id="albumsFullGrid"></div>
  </div>

  <!-- =========================================================
       VIEW 5: CHARTS SUB-PAGE
       ========================================================= -->
  <div id="view-charts" class="page-view">
    <div class="subpage-breadcrumb">
      <button class="back-pill-btn" data-subview="explore">← Explore</button>
    </div>
    <h1 class="page-hero-title">Charts</h1>

    <div class="country-select-wrap">
      <select id="chartCountrySelect" class="country-dropdown">
        <option value="Thailand">Thailand</option>
        <option value="Global">Global</option>
        <option value="Japan">Japan</option>
        <option value="South Korea">South Korea</option>
      </select>
    </div>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">Video charts</h2>
      </div>

      <div class="horizontal-scroll">
        <div class="card card-square" data-title="Trending 20 Thailand" data-artist="Chart - Youtube Charts" data-duration="3:40" data-cover="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square chart-yellow-card">
            <div class="chart-badge-top">TRENDING<br><strong>20</strong></div>
            <img src="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80)" alt="" class="chart-inset-img">
            <div class="chart-badge-bottom">THAILAND</div>
            <button class="play-overlay">▶</button>
          </div>
          <h3 class="card-title">Trending 20 Thailand</h3>
          <p class="card-sub">Chart - Youtube Charts</p>
        </div>

        <div class="card card-square" data-title="Daily Top 100 Music Videos" data-artist="Chart - Youtube Charts" data-duration="3:55" data-cover="[https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square chart-yellow-card">
            <div class="chart-badge-top"><small>DAILY</small><br>TOP 100<br>VIDEOS</div>
            <img src="[https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?auto=format&fit=crop&w=300&q=80)" alt="" class="chart-inset-img">
            <div class="chart-badge-bottom">THAILAND</div>
            <button class="play-overlay">▶</button>
          </div>
          <h3 class="card-title">Daily Top</h3>
          <p class="card-sub">Chart - Youtube Charts</p>
        </div>

        <div class="card card-square" data-title="Top 100 Music Videos Thailand" data-artist="Chart - Youtube Charts" data-duration="4:10" data-cover="[https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square chart-dark-card">
            <div class="chart-badge-top gold"><small>WEEKLY</small><br>TOP 100<br>VIDEOS</div>
            <img src="[https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80)" alt="" class="chart-inset-img">
            <div class="chart-badge-bottom gold">THAILAND</div>
            <span class="dots-menu">⋮</span>
            <button class="play-overlay" style="opacity:1;">▶</button>
          </div>
          <h3 class="card-title">Top 100 Music Videos Thailand</h3>
          <p class="card-sub">Chart - Youtube Charts</p>
        </div>
      </div>
    </section>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">Top artists</h2>
        <div class="carousel-controls">
          <button class="circle-btn">‹</button>
          <button class="circle-btn">›</button>
        </div>
      </div>
      <div class="top-artists-grid" id="topArtistsGrid"></div>
    </section>
  </div>

  <!-- =========================================================
       VIEW 6: MOODS & GENRES SUB-PAGE
       ========================================================= -->
  <div id="view-moods-genres" class="page-view">
    <div class="subpage-breadcrumb">
      <button class="back-pill-btn" data-subview="explore">← Explore</button>
    </div>
    <h1 class="page-hero-title">Moods &amp; genres</h1>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">For you</h2>
      </div>
      <div class="mood-bar-grid cols-4" id="mgForYouGrid"></div>
    </section>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">Moods &amp; moments</h2>
      </div>
      <div class="mood-bar-grid cols-4" id="mgMomentsGrid"></div>
    </section>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">Genres</h2>
      </div>
      <div class="mood-bar-grid cols-4" id="mgGenresGrid"></div>
    </section>
  </div>

  <!-- =========================================================
       VIEW 7: CATEGORY DETAIL PAGE
       ========================================================= -->
  <div id="view-category-detail" class="page-view">
    <div class="subpage-breadcrumb">
      <button class="back-pill-btn" data-subview="moods-genres">← Moods &amp; genres</button>
    </div>

    <div class="section-header" style="margin-bottom: 10px;">
      <h1 class="page-hero-title" id="categoryDetailTitle" style="margin-bottom: 0;">Thai-pop</h1>
      <div class="carousel-controls">
        <button class="circle-btn">‹</button>
        <button class="circle-btn">›</button>
      </div>
    </div>

    <section class="content-section" style="min-height: 220px;">
      <div class="section-header">
        <h2 class="section-title" style="font-size: 20px;">Song</h2>
      </div>
      <div class="tracks-grid" id="categorySongGrid"></div>
    </section>

    <section class="content-section">
      <div class="section-header">
        <h2 class="section-title">Hot-Hit</h2>
        <div class="carousel-controls-group">
          <button class="more-pill-btn" data-subview="albums-singles">More</button>
          <button class="circle-btn prev-btn" data-target="row-cat-hothit">‹</button>
          <button class="circle-btn next-btn" data-target="row-cat-hothit">›</button>
        </div>
      </div>

      <div class="horizontal-scroll" id="row-cat-hothit">
        <div class="card card-square" data-title="呪術廻戦 懐玉・玉折" data-artist="Album-LoFi Tokyo" data-duration="3:40" data-cover="[https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1614583225154-5fcdda07019e?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Deep Ocean Drift" data-artist="Album-LoFi Tokyo" data-duration="3:15" data-cover="[https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="COME ALIVE" data-artist="Album-LoFi Tokyo" data-duration="3:28" data-cover="[https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="OF SNOW AND EMBER" data-artist="Album-LoFi Tokyo" data-duration="4:05" data-cover="[https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1541701494587-cb58502866ab?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Crystal Phoenix" data-artist="Album-LoFi Tokyo" data-duration="3:50" data-cover="[https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1534447677768-be436bb09401?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
        <div class="card card-square" data-title="Good Morning Morioh Cho" data-artist="Album-LoFi Tokyo" data-duration="2:55" data-cover="[https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80)">
          <div class="thumb-wrap square"><img src="[https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1607604276583-eef5d076aa5f?auto=format&fit=crop&w=400&q=80)" alt=""><button class="play-overlay">▶</button></div>
          <h3 class="card-title">Blue &amp; Lonely</h3>
          <p class="card-sub">Album-LoFi Tokyo</p>
        </div>
      </div>
    </section>
  </div>

  <!-- =========================================================
       VIEW 8: LIBRARY PAGE (คลังเพลง)
       ========================================================= -->
  <div id="view-library" class="page-view">
    <div class="library-controls-bar">
      <div class="library-filter-chips" id="libraryFilterChips">
        <button class="lib-clear-btn hidden" id="libClearFilterBtn" title="ล้างตัวกรอง">✕</button>
        <button class="lib-chip" data-lib-cat="เพลย์ลิสต์">เพลย์ลิสต์</button>
        <button class="lib-chip" data-lib-cat="เพลง">เพลง</button>
        <button class="lib-chip" data-lib-cat="อัลบั้ม">อัลบั้ม</button>
        <button class="lib-chip" data-lib-cat="ศิลปิน">ศิลปิน</button>
        <button class="lib-chip" data-lib-cat="โปรไฟล์">โปรไฟล์</button>
        <button class="lib-chip" data-lib-cat="พอดแคสต์">พอดแคสต์</button>
      </div>

      <div class="library-sort-wrap">
        <button class="lib-sort-btn" id="libSortBtn">
          <span id="libSortLabel">รายการที่เพิ่งบันทึกไว้</span>
          <span class="sort-caret">⌄</span>
        </button>
        <div class="lib-sort-menu" id="libSortMenu">
          <div class="lib-sort-header">จัดเรียงตาม</div>
          <button class="lib-sort-option active" data-sort="recent">
            <span class="check-mark">✓</span>
            <span>รายการที่เพิ่งบันทึกไว้</span>
          </button>
          <button class="lib-sort-option" data-sort="asc">
            <span class="check-mark"></span>
            <span>ก ถึง ฮ</span>
          </button>
          <button class="lib-sort-option" data-sort="desc">
            <span class="check-mark"></span>
            <span>ฮ ถึง ก</span>
          </button>
        </div>
      </div>
    </div>

    <div class="library-grid-4" id="libraryItemsGrid"></div>
  </div>

  <!-- =========================================================
       VIEW 9: PROFILE PAGE (flowern)
       ========================================================= -->
  <div id="view-profile" class="page-view">
    <div class="profile-hero-bar">
      <div class="profile-identity">
        <img src="[https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=300&q=80)" alt="flowern" class="profile-avatar-lg" id="profilePageAvatar">
        <div class="profile-meta-text">
          <h1 class="profile-display-name" id="profilePageName">flowern</h1>
          <p class="profile-subscribers">No subscribers</p>
        </div>
      </div>

      <div class="profile-action-btns">
        <button class="profile-outline-btn" id="editProfileBtn">
          <svg viewBox="0 0 24 24" width="15" height="15" fill="none" stroke="currentColor" stroke-width="2">
            <path d="M12 20h9"/>
            <path d="M16.5 3.5a2.121 2.121 0 0 1 3 3L7 19l-4 1 1-4L16.5 3.5z"/>
          </svg>
          <span>Edit</span>
        </button>
        <button class="profile-outline-btn" id="shareProfileBtn">
          <svg viewBox="0 0 24 24" width="15" height="15" fill="none" stroke="currentColor" stroke-width="2">
            <polyline points="15 17 20 12 15 7"/>
            <path d="M4 18v-2a4 4 0 0 1 4-4h12"/>
          </svg>
          <span>Share</span>
        </button>
      </div>
    </div>

    <div id="profileToast" class="profile-toast hidden">คัดลอกลิงก์โปรไฟล์แล้ว</div>

    <!-- Personal mix Section -->
    <section class="profile-section">
      <h2 class="profile-section-heading">Personal mix</h2>
      <div class="personal-mix-empty">
        <p class="personal-mix-desc">Listen to more music so we can create a radio station that expresses your taste</p>
        <button class="discover-music-btn" id="discoverMusicBtn">
          <svg viewBox="0 0 24 24" width="16" height="16" fill="none" stroke="currentColor" stroke-width="2">
            <path d="M3 10.5L12 3l9 7.5"/>
            <path d="M5 9.5V20h14V9.5"/>
          </svg>
          <span>Discover music</span>
        </button>
      </div>
    </section>

    <!-- PUBLIC Playlists Section -->
    <section class="profile-section">
      <span class="profile-public-label">PUBLIC</span>
      <h2 class="profile-section-heading">Playlists</h2>

      <div class="profile-playlists-row">
        <div class="profile-playlist-card playable-item" data-title="เอาไว้ฟังตอนปั่น" data-artist="Playlist • flowern • 64 views" data-duration="4:18" data-cover="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=400&q=80)">
          <div class="profile-collage-box">
            <img src="[https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1514525253161-7a46d19cd819?auto=format&fit=crop&w=300&q=80)" alt="">
            <img src="[https://images.unsplash.com/photo-1507525428034-b723cf961d3e?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1507525428034-b723cf961d3e?auto=format&fit=crop&w=300&q=80)" alt="">
            <img src="[https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1618336753974-aae8e04506aa?auto=format&fit=crop&w=300&q=80)" alt="">
            <img src="[https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f?auto=format&fit=crop&w=300&q=80)" alt="">
            <button class="play-overlay">▶</button>
          </div>
          <h3 class="profile-pl-title">เอาไว้ฟังตอนปั่น</h3>
          <p class="profile-pl-sub">Playlist • <span id="plOwnerName">flowern</span> • 64 views</p>
          <span class="profile-pl-badge">4</span>
        </div>
      </div>
    </section>
  </div>

  <!-- =========================================================
       VIEW 10: SEARCH RESULTS PAGE (YT MUSIC | MUSIC LIBRARY)
       ========================================================= -->
  <div id="view-search" class="page-view">
    <!-- Source Tabs -->
    <div class="search-source-tabs">
      <button class="search-tab active" data-search-source="yt">YT MUSIC</button>
      <button class="search-tab" data-search-source="library">MUSIC LIBRARY</button>
    </div>

    <!-- Category Filter Chips -->
    <div class="search-filter-chips" id="searchFilterChips">
      <button class="s-chip" data-s-cat="Music">Music</button>
      <button class="s-chip" data-s-cat="Video">Video</button>
      <button class="s-chip" data-s-cat="Albums">Albums</button>
      <button class="s-chip" data-s-cat="Artist">Artist</button>
      <button class="s-chip" data-s-cat="Community playlists">Community playlists</button>
      <button class="s-chip" data-s-cat="Episodes">Episodes</button>
      <button class="s-chip" data-s-cat="Profile">Profile</button>
      <button class="s-chip" data-s-cat="Featured Playlists">Featured Playlists</button>
      <button class="s-chip" data-s-cat="Podcasts">Podcasts</button>
    </div>

    <!-- Top Result + More From YouTube Split Card -->
    <div class="search-top-showcase" id="searchTopShowcase">
      <div class="search-top-left" id="searchTopLeft"></div>
      <div class="search-top-divider"></div>
      <div class="search-top-right">
        <div class="search-more-label">MORE FROM YOUTUBE</div>
        <div class="search-more-list" id="searchMoreList"></div>
      </div>
    </div>

    <!-- Main Search Results List -->
    <div class="search-results-list" id="searchResultsList"></div>
  </div>

  <!-- Edit Profile Modal -->
  <div class="profile-modal-backdrop" id="editProfileModal">
    <div class="profile-modal-card">
      <div class="profile-modal-header">
        <h3>Edit profile</h3>
        <button class="profile-modal-close" id="closeEditProfileModal">✕</button>
      </div>
      <div class="profile-modal-body">
        <label class="profile-input-label" for="editNameInput">Display name</label>
        <input type="text" id="editNameInput" class="profile-text-input" value="flowern" maxlength="40">

        <label class="profile-input-label" for="editAvatarInput">Avatar URL</label>
        <input type="text" id="editAvatarInput" class="profile-text-input" value="[https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=300&q=80](https://images.unsplash.com/photo-1578632767115-351597cf2477?auto=format&fit=crop&w=300&q=80)">
      </div>
      <div class="profile-modal-footer">
        <button class="profile-outline-btn" id="cancelEditProfileBtn">Cancel</button>
        <button class="btn-white" id="saveEditProfileBtn">Save</button>
      </div>
    </div>
  </div>

  <!-- Site Footer -->
  <footer class="site-footer">
    <div class="footer-top">
      <div class="footer-columns">
        <div class="footer-col">
          <h4>Company</h4>
          <ul>
            <li><a href="#">About</a></li>
            <li><a href="#">Jobs</a></li>
            <li><a href="#">For the Record</a></li>
          </ul>
        </div>

        <div class="footer-col">
          <h4>Communities</h4>
          <ul>
            <li><a href="#">For Artists</a></li>
            <li><a href="#">For Creators</a></li>
            <li><a href="#">For Authors</a></li>
            <li><a href="#">Developers</a></li>
            <li><a href="#">Advertising</a></li>
            <li><a href="#">Investors</a></li>
            <li><a href="#">Vendors</a></li>
          </ul>
        </div>

        <div class="footer-col">
          <h4>Useful links</h4>
          <ul>
            <li><a href="#">Support</a></li>
            <li><a href="#">Free Mobile App</a></li>
            <li><a href="#">Popular by Country</a></li>
            <li><a href="#">Top Song Lyrics</a></li>
            <li><a href="#">Import your music</a></li>
          </ul>
        </div>

        <div class="footer-col">
          <h4>Spotify Plans</h4>
          <ul>
            <li><a href="#">Premium Individual</a></li>
            <li><a href="#">Premium Duo</a></li>
            <li><a href="#">Premium Family</a></li>
            <li><a href="#">Premium Student</a></li>
            <li><a href="#">Spotify Free</a></li>
          </ul>
        </div>
      </div>

      <div class="footer-socials">
        <a href="#" class="social-circle" aria-label="Instagram" title="Instagram">
          <svg viewBox="0 0 24 24" width="18" height="18" fill="currentColor">
            <path d="M7.8 2h8.4C19.4 2 22 4.6 22 7.8v8.4a5.8 5.8 0 0 1-5.8 5.8H7.8C4.6 22 2 19.4 2 16.2V7.8A5.8 5.8 0 0 1 7.8 2zm-.2 2A3.6 3.6 0 0 0 4 7.6v8.8C4 18.39 5.61 20 7.6 20h8.8a3.6 3.6 0 0 0 3.6-3.6V7.6C20 5.61 18.39 4 16.4 4H7.6zm9.65 1.5a1.25 1.25 0 0 1 1.25 1.25A1.25 1.25 0 0 1 17.25 8 1.25 1.25 0 0 1 16 6.75a1.25 1.25 0 0 1 1.25-1.25zM12 7a5 5 0 0 1 5 5 5 5 0 0 1-5 5 5 5 0 0 1-5-5 5 5 0 0 1 5-5zm0 2a3 3 0 0 0-3 3 3 3 0 0 0 3 3 3 3 0 0 0 3-3 3 3 0 0 0-3-3z"/>
          </svg>
        </a>
        <a href="#" class="social-circle" aria-label="X" title="X">
          <svg viewBox="0 0 24 24" width="16" height="16" fill="currentColor">
            <path d="M18.244 2.25h3.308l-7.227 8.26 8.502 11.24H16.17l-5.214-6.817L4.99 21.75H1.68l7.73-8.835L1.254 2.25H8.08l4.713 6.231zm-1.161 17.52h1.833L7.084 4.126H5.117z"/>
          </svg>
        </a>
        <a href="#" class="social-circle" aria-label="Facebook" title="Facebook">
          <svg viewBox="0 0 24 24" width="18" height="18" fill="currentColor">
            <path d="M22 12c0-5.52-4.48-10-10-10S2 6.48 2 12c0 4.84 3.44 8.87 8 9.8V15H8v-3h2V9.5C10 7.57 11.57 6 13.5 6H16v3h-2c-.55 0-1 .45-1 1v2h3v3h-3v6.95c5.05-.5 9-4.76 9-9.95z"/>
          </svg>
        </a>
      </div>
    </div>

    <hr class="footer-divider">

    <div class="footer-bottom">
      <div class="footer-legal-links">
        <a href="#">Legal</a>
        <a href="#">Safety &amp; Privacy Center</a>
        <a href="#">Privacy Policy</a>
        <a href="#">Cookies</a>
        <a href="#">About Ads</a>
        <a href="#">Accessibility</a>
      </div>
      <div class="footer-copyright">
        © 2026 Spotify AB
      </div>
    </div>
  </footer>

</main>

<!-- =========================================================
           VIEW 10: SEARCH RESULTS PAGE (YT MUSIC | MUSIC LIBRARY)
           ========================================================= -->
      <div id="view-search" class="page-view">
        <!-- Source Tabs -->
        <div class="search-source-tabs">
          <button class="search-tab active" data-search-source="yt">YT MUSIC</button>
          <button class="search-tab" data-search-source="library">MUSIC LIBRARY</button>
        </div>

        <!-- Category Filter Chips -->
        <div class="search-filter-chips" id="searchFilterChips">
          <button class="s-chip" data-s-cat="Music">Music</button>
          <button class="s-chip" data-s-cat="Video">Video</button>
          <button class="s-chip" data-s-cat="Albums">Albums</button>
          <button class="s-chip" data-s-cat="Artist">Artist</button>
          <button class="s-chip" data-s-cat="Community playlists">Community playlists</button>
          <button class="s-chip" data-s-cat="Episodes">Episodes</button>
          <button class="s-chip" data-s-cat="Profile">Profile</button>
          <button class="s-chip" data-s-cat="Featured Playlists">Featured Playlists</button>
          <button class="s-chip" data-s-cat="Podcasts">Podcasts</button>
        </div>

        <!-- Top Result + More From YouTube Split Card -->
        <div class="search-top-showcase" id="searchTopShowcase">
          <div class="search-top-left" id="searchTopLeft"></div>
          <div class="search-top-divider"></div>
          <div class="search-top-right">
            <div class="search-more-label">MORE FROM YOUTUBE</div>
            <div class="search-more-list" id="searchMoreList"></div>
          </div>
        </div>

        <!-- Main Search Results List -->
        <div class="search-results-list" id="searchResultsList"></div>
      </div>


