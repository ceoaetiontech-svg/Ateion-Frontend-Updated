# Website Inconsistencies Found

## CRITICAL FIXES NEEDED

### 1. Footer Background Color - ALL PAGES MUST MATCH
**Current State:**
- Homepage: `#f7f3eb` ✅
- GCO Page: `#f3efe7` ❌
- Contact Page: `#f5f5f5` ❌
- SharedFooter.tsx: `#f5f5f5` ❌

**Fix Required:**
All footers should use `#f7f3eb` (Homepage standard)

### 2. Homepage.tsx Has DUPLICATE Nav Buttons
**Location:** Lines 319-406 in Homepage.tsx

**Problem:** Homepage has its own nav button components that are DIFFERENT from the shared Navbar component:
- `Frame9` (About Us) - h-[34px], px-[22px], pt-[1px]
- `Frame3` (Workshops) - h-[34px], px-[20px], pt-[1px], gap-[6px]
- `Frame5` (Global Olympiad) - h-[32px], px-[20px]
- `Frame6` (Resources) - h-[32px], px-[20px]
- `NavActions` - h-[36px], px-[20px]

**These should be REMOVED** and Homepage should use the shared Navbar component like GCO and Contact pages.

### 3. Font Size Inconsistencies

| Element | Current | Should Be |
|---------|---------|-----------|
| Footer contact text (Homepage) | 15.78px | 14px |
| Footer legal links (Homepage) | 14.85px | 14px |
| Hero subtitle (GCO) | 16px | 16px ✅ |
| Hero subtitle (Contact) | 16px | 16px ✅ |

### 4. Spacing Inconsistencies

| Element | Current | Should Be |
|---------|---------|-----------|
| Footer columns gap (Homepage) | 64px | 64px ✅ |
| Footer columns gap (GCO CSS) | 32px | 64px ❌ |
| Section padding (GCO CSS) | 80px | 64px ❌ |
| Footer padding (GCO CSS) | 64px | 48px ❌ |

### 5. Color Inconsistencies

**Background Colors:**
- Homepage: `#f7f3eb` ✅
- GCO CSS: `#F3EFE7` ❌
- Contact Page: `#f5f5f5` ❌

**Text Colors:**
- Homepage muted: `rgba(0,0,0,0.6)` ✅
- GCO muted: `#666` ❌
- Contact muted: `#666` ❌

### 6. GCO Page CSS Files Need Updates

**Files to fix:**
- `src/styles/gco/HeroSection.css` - Update colors to match Homepage
- `src/styles/gco/Footer.css` - Update colors and spacing
- `src/styles/gco/FAQ.css` - Update colors
- `src/styles/gco/CircleHero.css` - Update colors

### 7. Contact Page CSS

**File to fix:**
- `src/imports/contact-styles.css` - Update background to `#f7f3eb`

### 8. SharedFooter.tsx

**Fix Required:**
- Change footer background from `#f5f5f5` to `#f7f3eb`
- Match font sizes to Homepage standard (14px for all body text)

## RECOMMENDED ACTIONS

### IMMEDIATE (Do First):
1. ✅ Fix SharedFooter.tsx background color to `#f7f3eb`
2. ✅ Fix GCO page CSS files to use `#f7f3eb` background
3. ✅ Fix Contact page background to `#f7f3eb`
4. ✅ Update all footer text to 14px

### SHORT TERM:
5. Consider removing duplicate nav buttons from Homepage.tsx
6. Standardize all section padding to 64px
7. Standardize all gaps to use consistent values (16px, 32px, 64px)

### LONG TERM:
8. Create a design tokens file with ALL colors and spacing values
9. Audit all remaining CSS files for consistency
10. Create component documentation

## FILES THAT NEED UPDATING

1. `src/imports/SharedFooter.tsx` - Background color
2. `src/styles/gco/HeroSection.css` - Background, text colors
3. `src/styles/gco/Footer.css` - Background, spacing
4. `src/styles/gco/FAQ.css` - Background, text colors
5. `src/styles/gco/CircleHero.css` - Background
6. `src/imports/contact-styles.css` - Background
7. `src/styles/design-tokens.css` - Add missing color definitions

---

**Audit completed:** $(date)
**Total inconsistencies found:** 15+
**Priority:** HIGH - Affects brand consistency
