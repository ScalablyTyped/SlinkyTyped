package typingsSlinky.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Services {
  
  @scala.inline
  def copyDataObject(dst: js.Any, src: js.Any): js.Any = (typingsSlinky.typescriptServices.global.TypeScript.Services.^.asInstanceOf[js.Dynamic].applyDynamic("copyDataObject")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def forwardJSONCall(
    logger: typingsSlinky.typescriptServices.TypeScript.ILogger,
    actionDescription: java.lang.String,
    action: js.Function0[_]
  ): java.lang.String = (typingsSlinky.typescriptServices.global.TypeScript.Services.^.asInstanceOf[js.Dynamic].applyDynamic("forwardJSONCall")(logger.asInstanceOf[js.Any], actionDescription.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def logInternalError(logger: typingsSlinky.typescriptServices.TypeScript.ILogger, err: js.Error): scala.Unit = (typingsSlinky.typescriptServices.global.TypeScript.Services.^.asInstanceOf[js.Dynamic].applyDynamic("logInternalError")(logger.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def simpleForwardCall(
    logger: typingsSlinky.typescriptServices.TypeScript.ILogger,
    actionDescription: java.lang.String,
    action: js.Function0[_]
  ): js.Any = (typingsSlinky.typescriptServices.global.TypeScript.Services.^.asInstanceOf[js.Dynamic].applyDynamic("simpleForwardCall")(logger.asInstanceOf[js.Any], actionDescription.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
