package typingsSlinky.storybookAddonNotes.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.storybookAddonNotes.sharedMod.TextParameter
  - typingsSlinky.storybookAddonNotes.sharedMod.MarkdownParameter
  - typingsSlinky.storybookAddonNotes.sharedMod.DisabledParameter
  - typingsSlinky.storybookAddonNotes.sharedMod.TabsParameter
*/
trait Parameters extends js.Object

object Parameters {
  @scala.inline
  implicit def apply(value: DisabledParameter): Parameters = value.asInstanceOf[Parameters]
  @scala.inline
  implicit def apply(value: MarkdownParameter): Parameters = value.asInstanceOf[Parameters]
  @scala.inline
  implicit def apply(value: String): Parameters = value.asInstanceOf[Parameters]
  @scala.inline
  implicit def apply(value: TabsParameter): Parameters = value.asInstanceOf[Parameters]
  @scala.inline
  implicit def apply(value: TextParameter): Parameters = value.asInstanceOf[Parameters]
}

