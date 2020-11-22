package typingsSlinky.storybookAddonKnobs

import slinky.core.ReactComponentClass
import typingsSlinky.storybookAddonKnobs.anon.Deserialize
import typingsSlinky.storybookAddonKnobs.anon.FunctionComponentBooleanT
import typingsSlinky.storybookAddonKnobs.anon.FunctionComponentButtonTy
import typingsSlinky.storybookAddonKnobs.anon.FunctionComponentFilesTyp
import typingsSlinky.storybookAddonKnobs.anon.FunctionComponentOptionsT
import typingsSlinky.storybookAddonKnobs.anon.FunctionComponentSelectTy
import typingsSlinky.storybookAddonKnobs.anon.TypeofArrayType
import typingsSlinky.storybookAddonKnobs.anon.TypeofColorType
import typingsSlinky.storybookAddonKnobs.anon.TypeofDateType
import typingsSlinky.storybookAddonKnobs.anon.TypeofNumberType
import typingsSlinky.storybookAddonKnobs.anon.TypeofObjectType
import typingsSlinky.storybookAddonKnobs.anon.TypeofRadiosType
import typingsSlinky.storybookAddonKnobs.anon.TypeofTextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  def getKnobControl(`type`: KnobType): KnobControlType = js.native
  
  /* keyof @storybook/addon-knobs.anon.Array */ /* Rewritten from type alias, can be one of: 
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
  
  type KnobControlType = ReactComponentClass[_] with Deserialize
}
