package typingsSlinky.vexdb.responseObjectsMod

import typingsSlinky.vexdb.vexdbNumbers.`0`
import typingsSlinky.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsResponseObject extends ResponseObject {
  var city: String = js.native
  var country: String = js.native
  var grade: String = js.native
  var is_registered: `0` | `1` = js.native
  var number: String = js.native
  var organisation: String = js.native
  var program: String = js.native
  var region: String = js.native
  var robot_name: String = js.native
  var team_name: String = js.native
}

object TeamsResponseObject {
  @scala.inline
  def apply(
    city: String,
    country: String,
    grade: String,
    is_registered: `0` | `1`,
    number: String,
    organisation: String,
    program: String,
    region: String,
    robot_name: String,
    team_name: String
  ): TeamsResponseObject = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], grade = grade.asInstanceOf[js.Any], is_registered = is_registered.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], organisation = organisation.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], robot_name = robot_name.asInstanceOf[js.Any], team_name = team_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsResponseObject]
  }
  @scala.inline
  implicit class TeamsResponseObjectOps[Self <: TeamsResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrade(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_registered(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_registered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganisation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organisation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRobot_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robot_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

