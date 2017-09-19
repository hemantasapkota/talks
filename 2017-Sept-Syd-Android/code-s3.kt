ankoView(::View, 0) {

  relativeLayout {
      backgroundResource = R.color.transparent

      // Add a child to root layout
      mFeedsTitle = textView("") {
          id = R.id.title_feed
          textColor = R.color.white
          textSize = 16f
          typeface = FontCache.fontOfType(FontCache.CustomFonts.gothamBook, context)
      }
  }

}
