package typingsSlinky.winjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object WinJS {
  
  //#endregion Objects
  //#region Functions
  /**
    * You can provide an implementation of this method yourself, or use WinJS.Utilities.startLog to create one that logs to the JavaScript console.
    * @param message The message to log.
    * @param tags The tag or tags to categorize the message (winjs, winjs controls, etc.).
    * @param type The type of message (error, warning, info, etc.).
    **/
  @scala.inline
  def log(message: java.lang.String): scala.Unit = typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def log(message: java.lang.String, tags: js.UndefOr[scala.Nothing], `type`: java.lang.String): scala.Unit = (typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def log(message: java.lang.String, tags: java.lang.String): scala.Unit = (typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def log(message: java.lang.String, tags: java.lang.String, `type`: java.lang.String): scala.Unit = (typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def log(message: js.Function0[java.lang.String]): scala.Unit = typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def log(message: js.Function0[java.lang.String], tags: js.UndefOr[scala.Nothing], `type`: java.lang.String): scala.Unit = (typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def log(message: js.Function0[java.lang.String], tags: java.lang.String): scala.Unit = (typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def log(message: js.Function0[java.lang.String], tags: java.lang.String, `type`: java.lang.String): scala.Unit = (typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  //#region Properties
  /**
    * Can be set to show the results of a validation process.
    **/
  @scala.inline
  def validation: scala.Boolean = typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].selectDynamic("validation").asInstanceOf[scala.Boolean]
  @scala.inline
  def validation_=(x: scala.Boolean): scala.Unit = typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].updateDynamic("validation")(x.asInstanceOf[js.Any])
  
  /**
    * Wraps calls to XMLHttpRequest in a promise.
    * @param options The options that are applied to the XMLHttpRequest object, as follows: type, url, user, password, responseType, headers, data, customRequestInitializer.
    * @returns A promise that returns the XMLHttpRequest object when it completes.
    **/
  @scala.inline
  def xhr(options: typingsSlinky.winjs.WinJS.IXHROptions): typingsSlinky.winjs.WinJS.Promise[org.scalajs.dom.raw.XMLHttpRequest] = typingsSlinky.winjs.global.WinJS.^.asInstanceOf[js.Dynamic].applyDynamic("xhr")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.winjs.WinJS.Promise[org.scalajs.dom.raw.XMLHttpRequest]]
}
