package typingsSlinky.vegas.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vegas.anon.ReadonlySettings
import typingsSlinky.vegas.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryExtension extends js.Object {
  
  def apply(): JQuery[HTMLElement] = js.native
  def apply(config: Settings): JQuery[HTMLElement] = js.native
  
  val defaults: ReadonlySettings = js.native
  
  def isVideoCompatible(): Boolean = js.native
}
