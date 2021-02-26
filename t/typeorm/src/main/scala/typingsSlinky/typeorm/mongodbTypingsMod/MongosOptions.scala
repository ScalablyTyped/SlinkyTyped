package typingsSlinky.typeorm.mongodbTypingsMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongosOptions extends StObject {
  
  /**
    * Ensure we check server identify during SSL, set to false to disable checking. Only works for Node 0.12.x or higher. You can pass in a boolean or your own checkServerIdentity override function.
    */
  var checkServerIdentity: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.native
  
  /**
    * Time between each replicaset status check.
    */
  var haInterval: js.UndefOr[scala.Double] = js.native
  
  /**
    * Number of connections in the connection pool for each server instance, set to 5 as default for legacy reasons.
    */
  var poolSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * Socket options.
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.native
  
  /**
    * Use ssl connection (needs to have a mongod server with ssl support).
    */
  var ssl: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of valid certificates either as Buffers or Strings (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.native
  
  /**
    * String or buffer containing the certificate we wish to present (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslCert: js.UndefOr[Buffer | String] = js.native
  
  /**
    * String or buffer containing the certificate private key we wish to present (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslKey: js.UndefOr[Buffer | String] = js.native
  
  /**
    * String or buffer containing the certificate password (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslPass: js.UndefOr[Buffer | String] = js.native
  
  /**
    * Validate mongod server certificate against ca (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslValidate: js.UndefOr[js.Object] = js.native
}
object MongosOptions {
  
  @scala.inline
  def apply(): MongosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongosOptions]
  }
  
  @scala.inline
  implicit class MongosOptionsMutableBuilder[Self <: MongosOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckServerIdentity(value: Boolean | js.Function): Self = StObject.set(x, "checkServerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
    
    @scala.inline
    def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaInterval(value: scala.Double): Self = StObject.set(x, "haInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaIntervalUndefined: Self = StObject.set(x, "haInterval", js.undefined)
    
    @scala.inline
    def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
    
    @scala.inline
    def setPoolSize(value: scala.Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: SocketOptions): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCA(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
    
    @scala.inline
    def setSslCAVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCA", js.Array(value :_*))
    
    @scala.inline
    def setSslCert(value: Buffer | String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
    
    @scala.inline
    def setSslKey(value: Buffer | String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
    
    @scala.inline
    def setSslPass(value: Buffer | String): Self = StObject.set(x, "sslPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPassUndefined: Self = StObject.set(x, "sslPass", js.undefined)
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setSslValidate(value: js.Object): Self = StObject.set(x, "sslValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslValidateUndefined: Self = StObject.set(x, "sslValidate", js.undefined)
  }
}
