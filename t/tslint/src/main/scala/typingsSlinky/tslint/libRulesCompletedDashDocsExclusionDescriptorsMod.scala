package typingsSlinky.tslint

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.ExclusionDescriptor
import typingsSlinky.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.InputExclusionDescriptor
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod.DocType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusionDescriptors", JSImport.Namespace)
@js.native
object libRulesCompletedDashDocsExclusionDescriptorsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDashDocsBlockExclusionMod.IBlockExclusionDescriptor
    - typings.tslint.libRulesCompletedDashDocsClassExclusionMod.IClassExclusionDescriptor
    - typings.tslint.libRulesCompletedDashDocsTagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends js.Object
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}

