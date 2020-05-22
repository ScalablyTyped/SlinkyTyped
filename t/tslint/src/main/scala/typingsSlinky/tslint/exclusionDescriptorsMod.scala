package typingsSlinky.tslint

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tslint.completedDocsRuleMod.DocType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusionDescriptors", JSImport.Namespace)
@js.native
object exclusionDescriptorsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tslint.blockExclusionMod.IBlockExclusionDescriptor
    - typingsSlinky.tslint.classExclusionMod.IClassExclusionDescriptor
    - typingsSlinky.tslint.tagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends js.Object
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}

