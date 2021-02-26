package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the face. */
@js.native
trait Face extends StObject {
  
  /** Age information about a face. */
  var age: js.UndefOr[FaceAge] = js.native
  
  /** The location of the bounding box around the face. */
  var face_location: js.UndefOr[FaceLocation] = js.native
  
  /** Information about the gender of the face. */
  var gender: js.UndefOr[FaceGender] = js.native
}
object Face {
  
  @scala.inline
  def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  
  @scala.inline
  implicit class FaceMutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: FaceAge): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    @scala.inline
    def setFace_location(value: FaceLocation): Self = StObject.set(x, "face_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFace_locationUndefined: Self = StObject.set(x, "face_location", js.undefined)
    
    @scala.inline
    def setGender(value: FaceGender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
  }
}
