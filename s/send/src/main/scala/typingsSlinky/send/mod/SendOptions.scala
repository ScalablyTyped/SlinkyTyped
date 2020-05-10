package typingsSlinky.send.mod

import typingsSlinky.send.sendStrings.allow
import typingsSlinky.send.sendStrings.deny
import typingsSlinky.send.sendStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendOptions extends js.Object {
  /**
    * Enable or disable accepting ranged requests, defaults to true.
    * Disabling this will not send Accept-Ranges and ignore the contents of the Range request header.
    */
  var acceptRanges: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable setting Cache-Control response header, defaults to true.
    * Disabling this will ignore the maxAge option.
    */
  var cacheControl: js.UndefOr[Boolean] = js.native
  /**
    * Set how "dotfiles" are treated when encountered.
    * A dotfile is a file or directory that begins with a dot (".").
    * Note this check is done on the path itself without checking if the path actually exists on the disk.
    * If root is specified, only the dotfiles above the root are checked (i.e. the root itself can be within a dotfile when when set to "deny").
    * 'allow' No special treatment for dotfiles.
    * 'deny' Send a 403 for any request for a dotfile.
    * 'ignore' Pretend like the dotfile does not exist and 404.
    * The default value is similar to 'ignore', with the exception that this default will not ignore the files within a directory that begins with a dot, for backward-compatibility.
    */
  var dotfiles: js.UndefOr[allow | deny | ignore] = js.native
  /**
    * Byte offset at which the stream ends, defaults to the length of the file minus 1.
    * The end is inclusive in the stream, meaning end: 3 will include the 4th byte in the stream.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Enable or disable etag generation, defaults to true.
    */
  var etag: js.UndefOr[Boolean] = js.native
  /**
    * If a given file doesn't exist, try appending one of the given extensions, in the given order.
    * By default, this is disabled (set to false).
    * An example value that will serve extension-less HTML files: ['html', 'htm'].
    * This is skipped if the requested file already has an extension.
    */
  var extensions: js.UndefOr[js.Array[String] | String | Boolean] = js.native
  /**
    * By default send supports "index.html" files, to disable this set false or to supply a new index pass a string or an array in preferred order.
    */
  var index: js.UndefOr[js.Array[String] | String | Boolean] = js.native
  /**
    * Enable or disable Last-Modified header, defaults to true.
    * Uses the file system's last modified value.
    */
  var lastModified: js.UndefOr[Boolean] = js.native
  /**
    * Provide a max-age in milliseconds for http caching, defaults to 0.
    * This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[String | Double] = js.native
  /**
    * Serve files relative to path.
    */
  var root: js.UndefOr[String] = js.native
  /**
    * Byte offset at which the stream starts, defaults to 0.
    * The start is inclusive, meaning start: 2 will include the 3rd byte in the stream.
    */
  var start: js.UndefOr[Double] = js.native
}

object SendOptions {
  @scala.inline
  def apply(): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendOptions]
  }
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withDotfiles(value: allow | deny | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotfiles")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String] | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: js.Array[String] | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

