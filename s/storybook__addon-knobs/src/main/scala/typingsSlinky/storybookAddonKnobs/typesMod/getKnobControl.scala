package typingsSlinky.storybookAddonKnobs.typesMod

import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`object`
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.array
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.boolean
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.button
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.color
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.date
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.files
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.number
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.options
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.radios
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.select
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types", "getKnobControl")
@js.native
object getKnobControl extends js.Object {
  def apply(
    `type`: number | boolean | `object` | color | button | select | text | date | options | radios | array | files
  ): KnobControlType = js.native
}

