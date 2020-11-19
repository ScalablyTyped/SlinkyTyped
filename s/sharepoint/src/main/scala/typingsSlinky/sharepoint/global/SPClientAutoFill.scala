package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.sharepoint.anon.Footer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientAutoFill")
@js.native
class SPClientAutoFill protected ()
  extends typingsSlinky.sharepoint.SPClientAutoFill {
  def this(
    elmTextId: String,
    elmContainerId: String,
    fnPopulateAutoFill: js.Function1[/* targetElement */ HTMLInputElement, Unit]
  ) = this()
}
/* static members */
@JSGlobal("SPClientAutoFill")
@js.native
object SPClientAutoFill extends js.Object {
  
   // = 'AutoFillKey';
  var DisplayTextProperty: String = js.native
  
  def GetAutoFillMenuItemFromOption(elmChild: HTMLElement): HTMLElement = js.native
  
  def GetAutoFillObjFromContainer(elmChild: HTMLElement): typingsSlinky.sharepoint.SPClientAutoFill = js.native
  
   // = 'AutoFillMenuOptionType';
  def GetAutoFillObjFromInput(elmText: HTMLInputElement): typingsSlinky.sharepoint.SPClientAutoFill = js.native
  
  var KeyProperty: String = js.native
  
  var MenuOptionType: Footer = js.native
  
   // = 'AutoFillTitleText';
  var MenuOptionTypeProperty: String = js.native
  
   // = 'AutoFillDisplayText';
  var SubDisplayTextProperty: String = js.native
  
   // = 'AutoFillSubDisplayText';
  var TitleTextProperty: String = js.native
}
