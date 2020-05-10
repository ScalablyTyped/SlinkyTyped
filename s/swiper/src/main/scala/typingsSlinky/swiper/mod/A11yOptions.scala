package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11yOptions extends js.Object {
  /**
    * Enables A11y
    *
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Message for screen readers for previous button when swiper is on first slide
    *
    * @default 'This is the first slide'
    */
  var firstSlideMessage: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for previous button when swiper is on last slide
    *
    * @default 'This is the last slide'
    */
  var lastSlideMessage: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for next button
    *
    * @default 'Next slide'
    */
  var nextSlideMessage: js.UndefOr[String] = js.native
  /**
    * CSS class name of a11 notification
    *
    * @default 'swiper-notification'
    */
  var notificationClass: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for single pagination bullet
    *
    * @default 'Go to slide {{index}}'
    */
  var paginationBulletMessage: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for previous button
    *
    * @default 'Previous slide'
    */
  var prevSlideMessage: js.UndefOr[String] = js.native
}

object A11yOptions {
  @scala.inline
  def apply(): A11yOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11yOptions]
  }
  @scala.inline
  implicit class A11yOptionsOps[Self <: A11yOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstSlideMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSlideMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSlideMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSlideMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSlideMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlideMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSlideMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlideMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSlideMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlideMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSlideMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlideMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationBulletMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationBulletMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationBulletMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationBulletMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevSlideMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSlideMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevSlideMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSlideMessage")(js.undefined)
        ret
    }
  }
  
}

