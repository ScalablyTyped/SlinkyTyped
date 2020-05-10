package typingsSlinky.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestExtra extends js.Object {
  /**
    * Set to true if this property must always be passed.
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  /**
    * The name of the property
    *
    * This name will be used in the extraProps argument itself.
    */
  var name: Extra = js.native
  /**
    * Possible values for this property.
    * This is useful for things like genres, where you need the user to select from a pre-set list of options.
    *
    * e.g. { name: "genre", options: ["Action", "Comedy", "Drama"] }
    *
    *
    * It's also useful if we want to specify a limited number of pages (for the skip parameter).
    *
    * e.g. { name: "skip", options: ["0", "100", "200"] }
    */
  var options: js.UndefOr[js.Array[String]] = js.native
  /**
    * The limit of values a user may select from the pre-set options list
    *
    * By default this is set to 1.
    */
  var optionsLimit: js.UndefOr[Double] = js.native
}

object ManifestExtra {
  @scala.inline
  def apply(name: Extra): ManifestExtra = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestExtra]
  }
  @scala.inline
  implicit class ManifestExtraOps[Self <: ManifestExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Extra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsLimit")(js.undefined)
        ret
    }
  }
  
}

