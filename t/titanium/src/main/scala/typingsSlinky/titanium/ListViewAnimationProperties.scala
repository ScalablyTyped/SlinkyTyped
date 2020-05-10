package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object for specifying the animation properties to use when inserting or deleting
  * sections or cells, or scrolling the list.
  */
@js.native
trait ListViewAnimationProperties extends js.Object {
  /**
  	 * Whether this list change should be animated. Ignored if any `animationStyle` value is specified.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Type of animation to use for cell insertions and deletions.
  	 */
  var animationStyle: js.UndefOr[Double] = js.native
  /**
  	 * Specifies what position to scroll the selected cell to.
  	 */
  var position: js.UndefOr[Double] = js.native
}

object ListViewAnimationProperties {
  @scala.inline
  def apply(): ListViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewAnimationProperties]
  }
  @scala.inline
  implicit class ListViewAnimationPropertiesOps[Self <: ListViewAnimationProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

