package typingsSlinky.sendgrid.mod.SendGrid

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail.Helper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendGridConstructor extends StObject {
  
  def apply(apiKey: String): typingsSlinky.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: js.UndefOr[scala.Nothing], globalHeaders: StringDictionary[String]): typingsSlinky.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String): typingsSlinky.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String, globalHeaders: StringDictionary[String]): typingsSlinky.sendgrid.mod.SendGrid.SendGrid = js.native
  
  var mail: Helper = js.native
}
