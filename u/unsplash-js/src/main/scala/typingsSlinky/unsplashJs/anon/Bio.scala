package typingsSlinky.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bio extends js.Object {
  var bio: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var firstName: js.UndefOr[String] = js.native
  var instagramUsername: js.UndefOr[String] = js.native
  var lastName: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object Bio {
  @scala.inline
  def apply(): Bio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bio]
  }
  @scala.inline
  implicit class BioOps[Self <: Bio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstagramUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagramUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstagramUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagramUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

