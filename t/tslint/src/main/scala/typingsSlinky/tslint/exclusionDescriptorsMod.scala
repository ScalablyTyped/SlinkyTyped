package typingsSlinky.tslint

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tslint.completedDocsRuleMod.DocType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclusionDescriptorsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tslint.blockExclusionMod.IBlockExclusionDescriptor
    - typingsSlinky.tslint.classExclusionMod.IClassExclusionDescriptor
    - typingsSlinky.tslint.tagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends StObject
  object ExclusionDescriptor {
    
    @scala.inline
    def IBlockExclusionDescriptor(): typingsSlinky.tslint.blockExclusionMod.IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.tslint.blockExclusionMod.IBlockExclusionDescriptor]
    }
    
    @scala.inline
    def IClassExclusionDescriptor(): typingsSlinky.tslint.classExclusionMod.IClassExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.tslint.classExclusionMod.IClassExclusionDescriptor]
    }
    
    @scala.inline
    def ITagExclusionDescriptor(): typingsSlinky.tslint.tagExclusionMod.ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.tslint.tagExclusionMod.ITagExclusionDescriptor]
    }
  }
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}
