package typingsSlinky.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderPerson extends js.Object {
  var _id: String = js.native
  var badges: js.Array[_] = js.native
  var bio: String = js.native
  var birth_date: String = js.native
  var gender: Double = js.native
  var name: String = js.native
  var photos: js.Array[TinderPhoto] = js.native
  var ping_time: String = js.native
  var user_number: Double = js.native
}

object TinderPerson {
  @scala.inline
  def apply(
    _id: String,
    badges: js.Array[_],
    bio: String,
    birth_date: String,
    gender: Double,
    name: String,
    photos: js.Array[TinderPhoto],
    ping_time: String,
    user_number: Double
  ): TinderPerson = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], ping_time = ping_time.asInstanceOf[js.Any], user_number = user_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderPerson]
  }
  @scala.inline
  implicit class TinderPersonOps[Self <: TinderPerson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirth_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birth_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[TinderPhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPing_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ping_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

