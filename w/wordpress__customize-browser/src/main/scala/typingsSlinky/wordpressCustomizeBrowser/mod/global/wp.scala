package typingsSlinky.wordpressCustomizeBrowser.mod.global

import typingsSlinky.jquery.JQuery.Promise
import typingsSlinky.wordpressCustomizeBrowser.customizeMod.Customize
import typingsSlinky.wordpressCustomizeBrowser.settingMod.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("wp")
@js.native
object wp extends js.Object {
  
  def customize(arg: String): Setting[_] = js.native
  def customize(args: (String | (js.Function1[/* repeated */ Setting[_], Unit]))*): Promise[_, _, _] = js.native
  @JSName("customize")
  var customize_Original: Customize = js.native
}
