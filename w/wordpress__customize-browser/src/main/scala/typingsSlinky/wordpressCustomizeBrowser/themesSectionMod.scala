package typingsSlinky.wordpressCustomizeBrowser

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.jquery.JQuery.Promise
import typingsSlinky.wordpressCustomizeBrowser.controlMod.Control
import typingsSlinky.wordpressCustomizeBrowser.externalMod.Theme
import typingsSlinky.wordpressCustomizeBrowser.sectionMod.Section
import typingsSlinky.wordpressCustomizeBrowser.themeControlMod.ThemeControl
import typingsSlinky.wordpressCustomizeBrowser.wordpressCustomizeBrowserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/ThemesSection", JSImport.Namespace)
@js.native
object themesSectionMod extends js.Object {
  
  @js.native
  class ThemesSection () extends Section {
    
    @JSName("$body")
    var $body: JQuery[HTMLElement] | Null = js.native
    
    @JSName("$window")
    var $window: JQuery[HTMLElement] | Null = js.native
    
    def checkTerm(section: ThemesSection): Unit = js.native
    
    def closeDetails(): Unit = js.native
    
    def containFocus(el: JQuery[HTMLElement]): Unit = js.native
    
    var currentTheme: String = js.native
    
    def filterSearch(term: String): Unit = js.native
    
    def filtersChecked(): Unit = js.native
    
    var filtersHeight: Double = js.native
    
    var fullyLoaded: Boolean = js.native
    
    def getNextTheme(): ThemeControl | `false` = js.native
    
    def getPreviousTheme(): ThemeControl | `false` = js.native
    
    def getVisibleCount(): Double = js.native
    
    var headerContatiner: JQuery[HTMLElement] | Null = js.native
    
    def initializeNewQuery(newTerm: String, newTags: js.Array[String]): Unit = js.native
    
    def loadControls(themes: js.Array[Theme], page: Double): Unit = js.native
    
    def loadMore(): Unit = js.native
    
    def loadThemePreview(themeId: String): Promise[_, _, _] = js.native
    
    def loadThemes(): Unit = js.native
    
    var loaded: Double = js.native
    
    var loading: Boolean = js.native
    
    var nextTags: String | js.Array[String] = js.native
    
    var nextTerm: String = js.native
    
    def nextTheme(): Unit = js.native
    
    var overlay: String = js.native
    
    def previousTheme(): Unit = js.native
    
    def renderScreenshots(): Unit = js.native
    
    var screenshotQueue: Null | js.Array[Control] = js.native
    
    def showDetails(theme: Theme): Unit = js.native
    def showDetails(theme: Theme, callback: js.Function0[Unit]): Unit = js.native
    
    var tags: String | js.Array[String] = js.native
    
    var template: String = js.native
    
    var term: String = js.native
    
    def updateCount(count: Double): Unit = js.native
    
    var updateCountDebounced: (js.Function1[/* count */ Double, Unit]) | Null = js.native
    
    def updateLimits(): Unit = js.native
  }
}
