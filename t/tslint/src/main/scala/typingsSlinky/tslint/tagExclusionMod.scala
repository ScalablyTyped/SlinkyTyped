package typingsSlinky.tslint

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.tslint.anon.Content
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typingsSlinky.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/tagExclusion", "TagExclusion")
  @js.native
  class TagExclusion () extends Exclusion[ITagExclusionDescriptor] {
    def this(descriptor: Partial[ITagExclusionDescriptor]) = this()
    
    val contentTags: js.Any = js.native
    
    val existenceTags: js.Any = js.native
    
    var getDocumentationNode: js.Any = js.native
    
    var parseTagsWithContents: js.Any = js.native
  }
  
  type IContentTags = StringDictionary[String]
  
  @js.native
  trait ITagExclusionDescriptor extends ExclusionDescriptor {
    
    var tags: js.UndefOr[Content] = js.native
  }
  object ITagExclusionDescriptor {
    
    @scala.inline
    def apply(): ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITagExclusionDescriptor]
    }
    
    @scala.inline
    implicit class ITagExclusionDescriptorMutableBuilder[Self <: ITagExclusionDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Content): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
