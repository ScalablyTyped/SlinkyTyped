package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailingSince extends StObject {
  
  var build: BuildReference = js.native
  
  var date: js.Date = js.native
  
  var release: ReleaseReference = js.native
}
object FailingSince {
  
  @scala.inline
  def apply(build: BuildReference, date: js.Date, release: ReleaseReference): FailingSince = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingSince]
  }
  
  @scala.inline
  implicit class FailingSinceMutableBuilder[Self <: FailingSince] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: BuildReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReleaseReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
