package typingsSlinky.storybookAddonKnobs

import slinky.core.ReactComponentClass
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

@JSImport("@storybook/addon-knobs/dist/components/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  /* keyof @storybook/addon-knobs.AnonArray */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.text
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.number
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.color
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.boolean
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`object`
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.select
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.radios
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.array
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.date
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.button
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.files
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.options
  */
  trait KnobType extends js.Object
  
  def getKnobControl(
    `type`: number | boolean | `object` | color | button | select | text | date | options | radios | array | files
  ): KnobControlType = js.native
  @js.native
  object default extends js.Object {
    var array: TypeofArrayType = js.native
    var boolean: FunctionComponentBooleanT = js.native
    var button: FunctionComponentButtonTy = js.native
    var color: TypeofColorType = js.native
    var date: TypeofDateType = js.native
    var files: FunctionComponentFilesTyp = js.native
    var number: TypeofNumberType = js.native
    var `object`: TypeofObjectType = js.native
    var options: FunctionComponentOptionsT = js.native
    var radios: TypeofRadiosType = js.native
    var select: FunctionComponentSelectTy = js.native
    var text: TypeofTextType = js.native
  }
  
  type KnobControlType = ReactComponentClass[_] with AnonDeserialize
}

