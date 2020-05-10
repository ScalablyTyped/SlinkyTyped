package typingsSlinky.sessionFileStore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FileStore Options
  */
@js.native
trait Options extends js.Object {
  /**
    * Decoding function. Takes encoded data, returns object. Defaults to `JSON.parse`
    */
  var decoder: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * Encoding function. Takes object, returns encoded data. Defaults to `JSON.stringify`
    */
  var encoder: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * Object-to-text text encoding. Can be null. Defaults to `'utf8'`
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Encryption output encoding. Defaults to `'hex'`
    */
  var encryptEncoding: js.UndefOr[String] = js.native
  /**
    * The exponential factor to use for retry. Defaults to `1`
    */
  var factor: js.UndefOr[Double] = js.native
  /**
    * Returns fallback session object after all failed retries. No defaults
    */
  var fallbackSessionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * File extension of saved files. Defaults to `'.json'`
    */
  var fileExtension: js.UndefOr[String] = js.native
  /**
    * Undocumented
    */
  var filePattern: js.UndefOr[js.RegExp] = js.native
  /**
    * Encryption key retrieval function. Takes secret andsession id, returns key.
    * Defaults to `function(secret, sessionId){return secret + sessionId;}`
    */
  var keyFunction: js.UndefOr[js.Function2[/* secret */ String, /* sessionId */ String, String]] = js.native
  /**
    * Log messages. Defaults to `console.log`
    */
  var logFn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * The maximum number of milliseconds between two retries. Defaults to `100`
    */
  var maxTimeout: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds before starting the first retry. Defaults to `50`
    */
  var minTimeout: js.UndefOr[Double] = js.native
  /**
    * The directory where the session files will be stored. Defaults to `./sessions`
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Use distinct worker process for removing stale sessions. Defaults to `false`
    */
  var reapAsync: js.UndefOr[Boolean] = js.native
  /**
    * Interval to clear expired sessions in seconds or -1 if do not need. Defaults to `1 hour`
    */
  var reapInterval: js.UndefOr[Double] = js.native
  /**
    * [OUT] Contains intervalObject if reap was scheduled
    */
  var reapIntervalObject: js.UndefOr[js.Any] = js.native
  /**
    * Undocumented
    */
  var reapMaxConcurrent: js.UndefOr[Double] = js.native
  /**
    * Reap stale sessions synchronously if can not do it asynchronously. Default to `false`
    */
  var reapSyncFallback: js.UndefOr[Boolean] = js.native
  /**
    * The number of retries to get session data from a session file. Defaults to `5`
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * If secret string is specified then enables encryption of the session before
    * writing the file and also decryption when reading it.
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * Session time to live in seconds. Defaults to `3600`
    */
  var ttl: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoder(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoder(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackSessionFn(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackSessionFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFallbackSessionFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackSessionFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFunction(value: (/* secret */ String, /* sessionId */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFn(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withReapAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReapAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withReapInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReapInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReapIntervalObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapIntervalObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReapIntervalObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapIntervalObject")(js.undefined)
        ret
    }
    @scala.inline
    def withReapMaxConcurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapMaxConcurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReapMaxConcurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapMaxConcurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withReapSyncFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapSyncFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReapSyncFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapSyncFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

