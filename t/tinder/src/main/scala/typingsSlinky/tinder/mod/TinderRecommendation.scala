package typingsSlinky.tinder.mod

import typingsSlinky.std.Number
import typingsSlinky.tinder.AnonString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderRecommendation extends js.Object {
   // todo
  var _id: String = js.native
  var badges: js.Array[_] = js.native
   // todo
  var bio: String = js.native
  var birth_date: String = js.native
   // todo
  var birth_date_info: String = js.native
  var common_connections: js.Array[_] = js.native
   // todo
  var common_friends: js.Array[_] = js.native
   // todo
  var common_interests: js.Array[_] = js.native
   // todo
  var common_likes: js.Array[_] = js.native
  var distance_mi: Number = js.native
  var gender: Double = js.native
  var jobs: js.Array[_] = js.native
  var name: String = js.native
  var photos: js.Array[TinderPhoto] = js.native
  var ping_time: String = js.native
   // todo
  var schools: js.Array[_] = js.native
   // todo
  var teaser: AnonString = js.native
   // todo
  var uncommon_interests: js.Array[_] = js.native
}

object TinderRecommendation {
  @scala.inline
  def apply(
    _id: String,
    badges: js.Array[_],
    bio: String,
    birth_date: String,
    birth_date_info: String,
    common_connections: js.Array[_],
    common_friends: js.Array[_],
    common_interests: js.Array[_],
    common_likes: js.Array[_],
    distance_mi: Number,
    gender: Double,
    jobs: js.Array[_],
    name: String,
    photos: js.Array[TinderPhoto],
    ping_time: String,
    schools: js.Array[_],
    teaser: AnonString,
    uncommon_interests: js.Array[_]
  ): TinderRecommendation = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], birth_date_info = birth_date_info.asInstanceOf[js.Any], common_connections = common_connections.asInstanceOf[js.Any], common_friends = common_friends.asInstanceOf[js.Any], common_interests = common_interests.asInstanceOf[js.Any], common_likes = common_likes.asInstanceOf[js.Any], distance_mi = distance_mi.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], ping_time = ping_time.asInstanceOf[js.Any], schools = schools.asInstanceOf[js.Any], teaser = teaser.asInstanceOf[js.Any], uncommon_interests = uncommon_interests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderRecommendation]
  }
  @scala.inline
  implicit class TinderRecommendationOps[Self <: TinderRecommendation] (val x: Self) extends AnyVal {
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
    def withBirth_date_info(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birth_date_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommon_connections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common_connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommon_friends(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common_friends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommon_interests(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common_interests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommon_likes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common_likes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance_mi(value: Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance_mi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
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
    def withSchools(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeaser(value: AnonString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teaser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncommon_interests(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncommon_interests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

