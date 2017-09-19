// Create Custom View
var LOADINGSPINNERVIEW_FACTORY = { ctx: Context -> LoadingSpinner(ctx) }
fun ViewManager.loadingSpinner(init: LoadingSpinner.() -> Unit = {}) = ankoView(LOADINGSPINNERVIEW_FACTORY, 0, init)

// Use custom view
loadingSpinner {
  ...
}
