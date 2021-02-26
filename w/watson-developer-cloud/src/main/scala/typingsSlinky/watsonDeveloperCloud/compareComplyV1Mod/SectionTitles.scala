package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array containing one object per section or subsection detected in the input document. Sections and subsections are not nested; instead, they are flattened out and can be placed back in order by using the `begin` and `end` values of the element and the `level` value of the section. */
@js.native
trait SectionTitles extends StObject {
  
  /** An array of `location` objects that lists the locations of detected section titles. */
  var element_locations: js.UndefOr[js.Array[ElementLocations]] = js.native
  
  /** An integer indicating the level at which the section is located in the input document. For example, `1` represents a top-level section, `2` represents a subsection within the level `1` section, and so forth. */
  var level: js.UndefOr[Double] = js.native
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  
  /** The text of the section title, if identified. */
  var text: js.UndefOr[String] = js.native
}
object SectionTitles {
  
  @scala.inline
  def apply(): SectionTitles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionTitles]
  }
  
  @scala.inline
  implicit class SectionTitlesMutableBuilder[Self <: SectionTitles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement_locations(value: js.Array[ElementLocations]): Self = StObject.set(x, "element_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement_locationsUndefined: Self = StObject.set(x, "element_locations", js.undefined)
    
    @scala.inline
    def setElement_locationsVarargs(value: ElementLocations*): Self = StObject.set(x, "element_locations", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
