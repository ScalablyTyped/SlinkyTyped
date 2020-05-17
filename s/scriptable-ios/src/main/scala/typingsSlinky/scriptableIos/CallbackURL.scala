package typingsSlinky.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Open x-callback-url requests._
  *
  * Constructs an object that opens x-callback-url requests and waits for a response from the target app.
  * @see https://docs.scriptable.app/callbackurl/#-new-callbackurl
  */
@js.native
trait CallbackURL extends js.Object {
  /**
    * _Construct CallbackURL._
    *
    * Appends a key/value pair to the base URL as a query parameter. The name and value are automatically encoded. Do not add the x-callback-url paramters, i.e. x-source, x-success,
    * x-error and x-cancel as Scriptable will add those.
    * @param name - Name of the query parameter to add.
    * @param value - Value of the query parameter to add.
    * @see https://docs.scriptable.app/callbackurl/#-addparameter
    */
  def addParameter(name: String, value: String): Unit = js.native
  /**
    * _Creates the callback URL._
    *
    * Creates a callback URL with the specified base URL and query parameters.
    * @see https://docs.scriptable.app/callbackurl/#-geturl
    */
  def getURL(): String = js.native
  /**
    * _Opens the callback URL._
    *
    * Opens the target app and waits for the target app to perform the action. The returned promise contains the query parameters supplied by the target app when it invokes the callback.
    * If the action failed in the target app or the action was cancelled, the promise will be rejected. The promise is also rejected if the action times out because the target app did
    * not invoke the callback.
    * @see https://docs.scriptable.app/callbackurl/#-open
    */
  def open(): js.Promise[_] = js.native
}

object CallbackURL {
  @scala.inline
  def apply(addParameter: (String, String) => Unit, getURL: () => String, open: () => js.Promise[_]): CallbackURL = {
    val __obj = js.Dynamic.literal(addParameter = js.Any.fromFunction2(addParameter), getURL = js.Any.fromFunction0(getURL), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[CallbackURL]
  }
  @scala.inline
  implicit class CallbackURLOps[Self <: CallbackURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddParameter(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

