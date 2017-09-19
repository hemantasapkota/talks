ankoView(::View, 0) {
    relativeLayout {
	  backgroundResource = R.color.transparent
	  mFeedsTitle = textView("") {
	      id = R.id.title_feed
	      ellipsize = TextUtils.TruncateAt.END
	      maxLines = 1
	      textColor = R.color.white
	      textSize = 16f
	      typeface = FontCache.fontOfType(FontCache.CustomFonts.gothamBook, context)
	  }.lparams(width = wrapContent, height = wrapContent) {
	      leftMargin = dip(10)
	      topMargin = dip(4)
	      rightMargin = dip(60)
	      bottomMargin = dip(10)
	  }
	  mMoreButton = relativeLayout {
	      id = R.id.more_button
	      onClick {
		  if (mCallback != null)
		      mCallback!!.onMoreSelected()
	      }
	    ....
}
