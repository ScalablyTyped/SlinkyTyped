package typingsSlinky.tizenTvWebapis

import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`10`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`11`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`12`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`13`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`14`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`15`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`16`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`17`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`18`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`19`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`20`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`21`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`22`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`23`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`24`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`25`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`26`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`27`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`28`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`4`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`5`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`6`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`7`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`8`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`9999`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webapisMod {
  
  type ErrorCallback = js.Function1[/* error */ WebAPIError, Unit]
  
  type SuccessCallback = js.Function0[Unit]
  
  @js.native
  trait WebAPIError extends StObject {
    
    /**
      * Error code
      * @since 2.3
      */
    val code: Double = js.native
    
    /**
      * Detailed error message
      * @since 2.3
      */
    val message: String = js.native
    
    /**
      * Error name. The attribute must return the value it was initialized with.
      * @since 2.3
      */
    val name: String = js.native
  }
  object WebAPIError {
    
    @scala.inline
    def apply(code: Double, message: String, name: String): WebAPIError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAPIError]
    }
    
    @scala.inline
    implicit class WebAPIErrorMutableBuilder[Self <: WebAPIError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebAPIException extends StObject {
    
    /**
      * Operation aborted
      * @since 2.3
      */
    var ABORT_ERR: `20` = js.native
    
    /**
      * Object cannot be cloned
      * @since 2.3
      */
    var DATA_CLONE_ERR: `25` = js.native
    
    /**
      * Specified text range is too large
      * @since 2.3
      */
    var DOMSTRING_SIZE_ERR: `2` = js.native
    
    /**
      * Operation yields an incorrect node tree
      * @since 2.3
      */
    var HIERARCHY_REQUEST_ERR: `3` = js.native
    
    /**
      * Index is not in the allowed range
      * @since 2.3
      */
    var INDEX_SIZE_ERR: `1` = js.native
    
    /**
      * Specified attribute already in use
      * @since 2.3
      */
    var INUSE_ATTRIBUTE_ERR: `10` = js.native
    
    /**
      * Object does not support the operation or argument
      * @since 2.3
      */
    var INVALID_ACCESS_ERR: `15` = js.native
    
    /**
      * String contains invalid characters
      * @since 2.3
      */
    var INVALID_CHARACTER_ERR: `5` = js.native
    
    /**
      * Object cannot be modified in this way
      * @since 2.3
      */
    var INVALID_MODIFICATION_ERR: `13` = js.native
    
    /**
      * Supplied node is incorrect or has an incorrect ancestor for this operation
      * @since 2.3
      */
    var INVALID_NODE_TYPE_ERR: `24` = js.native
    
    /**
      * Object is in an invalid state
      * @since 2.3
      */
    var INVALID_STATE_ERR: `11` = js.native
    
    /**
      * Input parameter contains an invalid value
      * @since 2.3
      */
    var INVALID_VALUES_ERR: `26` = js.native
    
    /**
      * IO error
      * @since 2.3
      */
    var IO_ERR: `27` = js.native
    
    /**
      * Operation not allowed in XML namespaces
      * @since 2.3
      */
    var NAMESPACE_ERR: `14` = js.native
    
    /**
      * Network error occurred
      * @since 2.3
      */
    var NETWORK_ERR: `19` = js.native
    
    /**
      * Object not found
      * @since 2.3
      */
    var NOT_FOUND_ERR: `8` = js.native
    
    /**
      * Operation not supported
      * @since 2.3
      */
    var NOT_SUPPORTED_ERR: `9` = js.native
    
    /**
      * Data specified for a node that does not support it
      * @since 2.3
      */
    var NO_DATA_ALLOWED_ERR: `6` = js.native
    
    /**
      * Object cannot be modified
      * @since 2.3
      */
    var NO_MODIFICATION_ALLOWED_ERR: `7` = js.native
    
    /**
      * Quota exceeded
      * @since 2.3
      */
    var QUOTA_EXCEEDED_ERR: `22` = js.native
    
    /**
      * Operation insecure
      * @since 2.3
      */
    var SECURITY_ERR: `18` = js.native
    
    /**
      * Service not available
      * @since 2.3
      */
    var SERVICE_NOT_AVAILABLE_ERR: `28` = js.native
    
    /**
      * String does not match the expected pattern
      * @since 2.3
      */
    var SYNTAX_ERR: `12` = js.native
    
    /**
      * Operation timed out
      * @since 2.3
      */
    var TIMEOUT_ERR: `23` = js.native
    
    /**
      * Object type does not match the expected type
      * @since 2.3
      */
    var TYPE_MISMATCH_ERR: `17` = js.native
    
    /**
      * Unknown error
      * @since 2.3
      */
    var UNKNOWN_ERR: `9999` = js.native
    
    /**
      * URL provided does not match
      * @since 2.3
      */
    var URL_MISMATCH_ERR: `21` = js.native
    
    /**
      * Operation causes the node to fail validation
      * @since 2.3
      */
    var VALIDATION_ERR: `16` = js.native
    
    /**
      * Object is in the wrong document
      * @since 2.3
      */
    var WRONG_DOCUMENT_ERR: `4` = js.native
    
    /**
      * Error code
      * @since 2.3
      */
    val code: Double = js.native
    
    /**
      * Detailed error message
      * @since 2.3
      */
    val message: String = js.native
    
    /**
      * Error name. The attribute must return the value it was initialized with.\
      * @since 2.3
      */
    val name: String = js.native
  }
  object WebAPIException {
    
    @scala.inline
    def apply(
      ABORT_ERR: `20`,
      DATA_CLONE_ERR: `25`,
      DOMSTRING_SIZE_ERR: `2`,
      HIERARCHY_REQUEST_ERR: `3`,
      INDEX_SIZE_ERR: `1`,
      INUSE_ATTRIBUTE_ERR: `10`,
      INVALID_ACCESS_ERR: `15`,
      INVALID_CHARACTER_ERR: `5`,
      INVALID_MODIFICATION_ERR: `13`,
      INVALID_NODE_TYPE_ERR: `24`,
      INVALID_STATE_ERR: `11`,
      INVALID_VALUES_ERR: `26`,
      IO_ERR: `27`,
      NAMESPACE_ERR: `14`,
      NETWORK_ERR: `19`,
      NOT_FOUND_ERR: `8`,
      NOT_SUPPORTED_ERR: `9`,
      NO_DATA_ALLOWED_ERR: `6`,
      NO_MODIFICATION_ALLOWED_ERR: `7`,
      QUOTA_EXCEEDED_ERR: `22`,
      SECURITY_ERR: `18`,
      SERVICE_NOT_AVAILABLE_ERR: `28`,
      SYNTAX_ERR: `12`,
      TIMEOUT_ERR: `23`,
      TYPE_MISMATCH_ERR: `17`,
      UNKNOWN_ERR: `9999`,
      URL_MISMATCH_ERR: `21`,
      VALIDATION_ERR: `16`,
      WRONG_DOCUMENT_ERR: `4`,
      code: Double,
      message: String,
      name: String
    ): WebAPIException = {
      val __obj = js.Dynamic.literal(ABORT_ERR = ABORT_ERR.asInstanceOf[js.Any], DATA_CLONE_ERR = DATA_CLONE_ERR.asInstanceOf[js.Any], DOMSTRING_SIZE_ERR = DOMSTRING_SIZE_ERR.asInstanceOf[js.Any], HIERARCHY_REQUEST_ERR = HIERARCHY_REQUEST_ERR.asInstanceOf[js.Any], INDEX_SIZE_ERR = INDEX_SIZE_ERR.asInstanceOf[js.Any], INUSE_ATTRIBUTE_ERR = INUSE_ATTRIBUTE_ERR.asInstanceOf[js.Any], INVALID_ACCESS_ERR = INVALID_ACCESS_ERR.asInstanceOf[js.Any], INVALID_CHARACTER_ERR = INVALID_CHARACTER_ERR.asInstanceOf[js.Any], INVALID_MODIFICATION_ERR = INVALID_MODIFICATION_ERR.asInstanceOf[js.Any], INVALID_NODE_TYPE_ERR = INVALID_NODE_TYPE_ERR.asInstanceOf[js.Any], INVALID_STATE_ERR = INVALID_STATE_ERR.asInstanceOf[js.Any], INVALID_VALUES_ERR = INVALID_VALUES_ERR.asInstanceOf[js.Any], IO_ERR = IO_ERR.asInstanceOf[js.Any], NAMESPACE_ERR = NAMESPACE_ERR.asInstanceOf[js.Any], NETWORK_ERR = NETWORK_ERR.asInstanceOf[js.Any], NOT_FOUND_ERR = NOT_FOUND_ERR.asInstanceOf[js.Any], NOT_SUPPORTED_ERR = NOT_SUPPORTED_ERR.asInstanceOf[js.Any], NO_DATA_ALLOWED_ERR = NO_DATA_ALLOWED_ERR.asInstanceOf[js.Any], NO_MODIFICATION_ALLOWED_ERR = NO_MODIFICATION_ALLOWED_ERR.asInstanceOf[js.Any], QUOTA_EXCEEDED_ERR = QUOTA_EXCEEDED_ERR.asInstanceOf[js.Any], SECURITY_ERR = SECURITY_ERR.asInstanceOf[js.Any], SERVICE_NOT_AVAILABLE_ERR = SERVICE_NOT_AVAILABLE_ERR.asInstanceOf[js.Any], SYNTAX_ERR = SYNTAX_ERR.asInstanceOf[js.Any], TIMEOUT_ERR = TIMEOUT_ERR.asInstanceOf[js.Any], TYPE_MISMATCH_ERR = TYPE_MISMATCH_ERR.asInstanceOf[js.Any], UNKNOWN_ERR = UNKNOWN_ERR.asInstanceOf[js.Any], URL_MISMATCH_ERR = URL_MISMATCH_ERR.asInstanceOf[js.Any], VALIDATION_ERR = VALIDATION_ERR.asInstanceOf[js.Any], WRONG_DOCUMENT_ERR = WRONG_DOCUMENT_ERR.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAPIException]
    }
    
    @scala.inline
    implicit class WebAPIExceptionMutableBuilder[Self <: WebAPIException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setABORT_ERR(value: `20`): Self = StObject.set(x, "ABORT_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDATA_CLONE_ERR(value: `25`): Self = StObject.set(x, "DATA_CLONE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDOMSTRING_SIZE_ERR(value: `2`): Self = StObject.set(x, "DOMSTRING_SIZE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHIERARCHY_REQUEST_ERR(value: `3`): Self = StObject.set(x, "HIERARCHY_REQUEST_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINDEX_SIZE_ERR(value: `1`): Self = StObject.set(x, "INDEX_SIZE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINUSE_ATTRIBUTE_ERR(value: `10`): Self = StObject.set(x, "INUSE_ATTRIBUTE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINVALID_ACCESS_ERR(value: `15`): Self = StObject.set(x, "INVALID_ACCESS_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINVALID_CHARACTER_ERR(value: `5`): Self = StObject.set(x, "INVALID_CHARACTER_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINVALID_MODIFICATION_ERR(value: `13`): Self = StObject.set(x, "INVALID_MODIFICATION_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINVALID_NODE_TYPE_ERR(value: `24`): Self = StObject.set(x, "INVALID_NODE_TYPE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINVALID_STATE_ERR(value: `11`): Self = StObject.set(x, "INVALID_STATE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINVALID_VALUES_ERR(value: `26`): Self = StObject.set(x, "INVALID_VALUES_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIO_ERR(value: `27`): Self = StObject.set(x, "IO_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNAMESPACE_ERR(value: `14`): Self = StObject.set(x, "NAMESPACE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNETWORK_ERR(value: `19`): Self = StObject.set(x, "NETWORK_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_FOUND_ERR(value: `8`): Self = StObject.set(x, "NOT_FOUND_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_SUPPORTED_ERR(value: `9`): Self = StObject.set(x, "NOT_SUPPORTED_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNO_DATA_ALLOWED_ERR(value: `6`): Self = StObject.set(x, "NO_DATA_ALLOWED_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNO_MODIFICATION_ALLOWED_ERR(value: `7`): Self = StObject.set(x, "NO_MODIFICATION_ALLOWED_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUOTA_EXCEEDED_ERR(value: `22`): Self = StObject.set(x, "QUOTA_EXCEEDED_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSECURITY_ERR(value: `18`): Self = StObject.set(x, "SECURITY_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSERVICE_NOT_AVAILABLE_ERR(value: `28`): Self = StObject.set(x, "SERVICE_NOT_AVAILABLE_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSYNTAX_ERR(value: `12`): Self = StObject.set(x, "SYNTAX_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTIMEOUT_ERR(value: `23`): Self = StObject.set(x, "TIMEOUT_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTYPE_MISMATCH_ERR(value: `17`): Self = StObject.set(x, "TYPE_MISMATCH_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNKNOWN_ERR(value: `9999`): Self = StObject.set(x, "UNKNOWN_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURL_MISMATCH_ERR(value: `21`): Self = StObject.set(x, "URL_MISMATCH_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVALIDATION_ERR(value: `16`): Self = StObject.set(x, "VALIDATION_ERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWRONG_DOCUMENT_ERR(value: `4`): Self = StObject.set(x, "WRONG_DOCUMENT_ERR", value.asInstanceOf[js.Any])
    }
  }
}
