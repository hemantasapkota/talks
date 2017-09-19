ankoView(::View, 0) {
  relativeLayout {
      backgroundResource = R.color.transparent

      // Add a child to root layout
      mFeedsTitle = textView("") {
          id = R.id.title_feed
          textColor = R.color.white
          textSize = 16f
          typeface = FontCache.fontOfType(FontCache.CustomFonts.gothamBook, context)
      }.lparams(width = wrapContent, height = wrapContent) {
          // Specify layout parameters
          leftMargin = dip(10)
          topMargin = dip(4)
          rightMargin = dip(60)
          bottomMargin = dip(10)
      }

  }
}
