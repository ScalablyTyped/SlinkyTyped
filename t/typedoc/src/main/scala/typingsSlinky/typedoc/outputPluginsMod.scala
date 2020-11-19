package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.Area
import typingsSlinky.typedoc.anon.Caption
import typingsSlinky.typedoc.anon.Code
import typingsSlinky.typedoc.navigationItemMod.NavigationItem
import typingsSlinky.typedoc.reflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins", JSImport.Namespace)
@js.native
object outputPluginsMod extends js.Object {
  
  @js.native
  class AssetsPlugin ()
    extends typingsSlinky.typedoc.assetsPluginMod.AssetsPlugin
  
  @js.native
  class JavascriptIndexPlugin ()
    extends typingsSlinky.typedoc.javascriptIndexPluginMod.JavascriptIndexPlugin
  
  @js.native
  class LayoutPlugin ()
    extends typingsSlinky.typedoc.layoutPluginMod.LayoutPlugin
  
  @js.native
  class LegendPlugin ()
    extends typingsSlinky.typedoc.legendPluginMod.LegendPlugin
  
  @js.native
  class MarkedLinksPlugin ()
    extends typingsSlinky.typedoc.markedLinksPluginMod.MarkedLinksPlugin
  /* static members */
  @js.native
  object MarkedLinksPlugin extends js.Object {
    
    def splitLinkText(text: String): Caption = js.native
  }
  
  @js.native
  class MarkedPlugin ()
    extends typingsSlinky.typedoc.markedPluginMod.MarkedPlugin
  
  @js.native
  class NavigationPlugin ()
    extends typingsSlinky.typedoc.navigationPluginMod.NavigationPlugin
  
  @js.native
  class PrettyPrintPlugin ()
    extends typingsSlinky.typedoc.prettyPrintPluginMod.PrettyPrintPlugin
  /* static members */
  @js.native
  object PrettyPrintPlugin extends js.Object {
    
    var IGNORED_TAGS: Area = js.native
    
    var PRE_TAGS: Code = js.native
  }
  
  @js.native
  class TocPlugin ()
    extends typingsSlinky.typedoc.tocPluginMod.TocPlugin
  /* static members */
  @js.native
  object TocPlugin extends js.Object {
    
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = js.native
  }
}
