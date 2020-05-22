package typingsSlinky.storybookAddonNotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.storybookAddonNotes.sharedMod.TextParameter
    - typingsSlinky.storybookAddonNotes.sharedMod.MarkdownParameter
    - typingsSlinky.storybookAddonNotes.sharedMod.DisabledParameter
    - typingsSlinky.storybookAddonNotes.sharedMod.TabsParameter
  */
  type Parameters = typingsSlinky.storybookAddonNotes.sharedMod._Parameters | java.lang.String | typingsSlinky.storybookAddonNotes.sharedMod.TabsParameter
  type TabsParameter = typingsSlinky.std.Record[java.lang.String, java.lang.String]
}
