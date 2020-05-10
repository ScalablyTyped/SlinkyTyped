package typingsSlinky.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  var applicationContainer: AttributesContainer = js.native
  var coreAttributes: StringDictionary[CoreProfileAttribute] = js.native
  var coreRevision: Double = js.native
  var id: String = js.native
  var revision: Double = js.native
  var timeStamp: js.Date = js.native
}

object Profile {
  @scala.inline
  def apply(
    applicationContainer: AttributesContainer,
    coreAttributes: StringDictionary[CoreProfileAttribute],
    coreRevision: Double,
    id: String,
    revision: Double,
    timeStamp: js.Date
  ): Profile = {
    val __obj = js.Dynamic.literal(applicationContainer = applicationContainer.asInstanceOf[js.Any], coreAttributes = coreAttributes.asInstanceOf[js.Any], coreRevision = coreRevision.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationContainer(value: AttributesContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoreAttributes(value: StringDictionary[CoreProfileAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoreRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

