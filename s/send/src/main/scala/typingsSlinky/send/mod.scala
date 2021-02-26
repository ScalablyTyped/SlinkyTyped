package typingsSlinky.send

import typingsSlinky.mime.mod.TypeMap
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.send.sendStrings.allow
import typingsSlinky.send.sendStrings.deny
import typingsSlinky.send.sendStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new SendStream for the given path to send to a res.
    * The req is the Node.js HTTP request and the path is a urlencoded path to send (urlencoded, not the actual file-system path).
    */
  @JSImport("send", JSImport.Namespace)
  @js.native
  def apply(req: Readable, path: String): SendStream = js.native
  @JSImport("send", JSImport.Namespace)
  @js.native
  def apply(req: Readable, path: String, options: SendOptions): SendStream = js.native
  
  object mime {
    
    @JSImport("send", "mime.define")
    @js.native
    def define(mimes: TypeMap): Unit = js.native
    @JSImport("send", "mime.define")
    @js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    
    @JSImport("send", "mime.getExtension")
    @js.native
    def getExtension(mime: String): String | Null = js.native
    
    @JSImport("send", "mime.getType")
    @js.native
    def getType(path: String): String | Null = js.native
  }
  
  @js.native
  trait SendOptions extends StObject {
    
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
    implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptRanges(value: Boolean): Self = StObject.set(x, "acceptRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptRangesUndefined: Self = StObject.set(x, "acceptRanges", js.undefined)
      
      @scala.inline
      def setCacheControl(value: Boolean): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setDotfiles(value: allow | deny | ignore): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEtag(value: Boolean): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String] | String | Boolean): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: js.Array[String] | String | Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      @scala.inline
      def setLastModified(value: Boolean): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      @scala.inline
      def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait SendStream extends Stream {
    
    /**
      * Emit error with `status`.
      * @private
      */
    def error(status: Double): Unit = js.native
    def error(status: Double, error: js.Error): Unit = js.native
    
    /**
      * @deprecated pass etag as option
      * Enable or disable etag generation.
      */
    def etag(`val`: Boolean): SendStream = js.native
    
    /**
      * @deprecated pass root as option
      * Set root `path`.
      */
    def from(paths: String): SendStream = js.native
    
    /**
      * Check if the pathname ends with "/".
      * @private
      */
    def hasTrailingSlash(): Boolean = js.native
    
    /**
      * Raise error that headers already sent.
      * @private
      */
    def headersAlreadySent(): Unit = js.native
    
    /**
      * @deprecated use dotfiles option
      * Enable or disable "hidden" (dot) files.
      */
    def hidden(`val`: Boolean): SendStream = js.native
    
    def index(paths: String): SendStream = js.native
    /**
      * @deprecated pass index as option
      * Set index `paths`, set to a falsy value to disable index support.
      */
    def index(paths: js.Array[String]): SendStream = js.native
    
    /**
      * Check if the request is cacheable, aka responded with 2xx or 304 (see RFC 2616 section 14.2{5,6}).
      * @private
      */
    def isCachable(): Boolean = js.native
    
    /**
      * Check if this is a conditional GET request.
      * @private
      */
    def isConditionalGET(): Boolean = js.native
    
    /**
      * Check if the cache is fresh.
      * @private
      */
    def isFresh(): Boolean = js.native
    
    /**
      * Check if the range is fresh.
      * @private
      */
    def isRangeFresh(): Boolean = js.native
    
    /**
      * @deprecated pass maxAge as option
      * Set max-age to `maxAge`.
      */
    def maxage(maxAge: String): SendStream = js.native
    def maxage(maxAge: Double): SendStream = js.native
    
    /**
      * Respond with 304 not modified.
      * @private
      */
    def notModified(): Unit = js.native
    
    /**
      * Handle stat() error.
      * @private
      */
    def onStatError(error: js.Error): Unit = js.native
    
    /**
      * Redirect to path.
      * @private
      */
    def redirect(path: String): Unit = js.native
    
    /**
      * Strip content-* header fields.
      * @private
      */
    def removeContentHeaderFields(): Unit = js.native
    
    /**
      * @deprecated pass root as option
      * Set root `path`.
      */
    def root(paths: String): SendStream = js.native
    
    /**
      * Transfer `path`.
      */
    def send(path: String): Unit = js.native
    def send(path: String, stat: Stats): Unit = js.native
    
    /**
      * Transfer file for `path`.
      * @private
      */
    def sendFile(path: String): Unit = js.native
    
    /**
      * Transfer index for `path`.
      * @private
      */
    def sendIndex(path: String): Unit = js.native
    
    /**
      * Set response header fields, most fields may be pre-defined.
      * @private
      */
    def setHeader(path: String, stat: Stats): Unit = js.native
    
    /**
      * Transfer index for `path`.
      * @private
      */
    def stream(path: String): Unit = js.native
    def stream(path: String, options: js.Object): Unit = js.native
    
    /**
      * Set content-type based on `path` if it hasn't been explicitly set.
      * @private
      */
    def `type`(path: String): Unit = js.native
  }
}
