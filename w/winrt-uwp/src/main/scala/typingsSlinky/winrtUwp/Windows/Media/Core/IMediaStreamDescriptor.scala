package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a media stream. */
@js.native
trait IMediaStreamDescriptor extends js.Object {
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean = js.native
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String = js.native
  /** Gets or sets the name of the stream. */
  var name: String = js.native
}

object IMediaStreamDescriptor {
  @scala.inline
  def apply(isSelected: Boolean, language: String, name: String): IMediaStreamDescriptor = {
    val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaStreamDescriptor]
  }
  @scala.inline
  implicit class IMediaStreamDescriptorOps[Self <: IMediaStreamDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

