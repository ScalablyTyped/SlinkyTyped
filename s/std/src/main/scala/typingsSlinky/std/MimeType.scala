package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object. */
@js.native
trait MimeType extends js.Object {
  /**
    * Returns the MIME type's description.
    */
  val description: java.lang.String = js.native
  /**
    * Returns the Plugin object that implements this MIME type.
    */
  val enabledPlugin: Plugin = js.native
  /**
    * Returns the MIME type's typical file extensions, in a comma-separated list.
    */
  val suffixes: java.lang.String = js.native
  /**
    * Returns the MIME type.
    */
  val `type`: java.lang.String = js.native
}

object MimeType {
  @scala.inline
  def apply(
    description: java.lang.String,
    enabledPlugin: Plugin,
    suffixes: java.lang.String,
    `type`: java.lang.String
  ): MimeType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabledPlugin = enabledPlugin.asInstanceOf[js.Any], suffixes = suffixes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
  @scala.inline
  implicit class MimeTypeOps[Self <: MimeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabledPlugin(value: Plugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixes(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

