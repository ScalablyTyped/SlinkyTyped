package typingsSlinky.wixUiIconsCommon

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait IconMetadata extends StObject {
    
    /** some icons have duplicates under different names,
      * lists all files that are described by this metadata */
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    var category: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var sizes: Record[String, String] = js.native
    
    /** tags to be used for searching icons in storybook */
    var tags: js.Array[String] = js.native
    
    var title: String = js.native
  }
  object IconMetadata {
    
    @scala.inline
    def apply(sizes: Record[String, String], tags: js.Array[String], title: String): IconMetadata = {
      val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconMetadata]
    }
    
    @scala.inline
    implicit class IconMetadataMutableBuilder[Self <: IconMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setSizes(value: Record[String, String]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
