package typingsSlinky.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentBucket extends StObject {
  
  var blockPublicAccess: js.UndefOr[Boolean] = js.native
  
  var maxPreviousDeploymentArtifacts: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var serverSideEncryption: js.UndefOr[String] = js.native
  
  var sseCustomerAlgorithim: js.UndefOr[String] = js.native
  
  var sseCustomerKey: js.UndefOr[String] = js.native
  
  var sseCustomerKeyMD5: js.UndefOr[String] = js.native
  
  var sseKMSKeyId: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[Tags] = js.native
}
object DeploymentBucket {
  
  @scala.inline
  def apply(): DeploymentBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentBucket]
  }
  
  @scala.inline
  implicit class DeploymentBucketMutableBuilder[Self <: DeploymentBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockPublicAccess(value: Boolean): Self = StObject.set(x, "blockPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicAccessUndefined: Self = StObject.set(x, "blockPublicAccess", js.undefined)
    
    @scala.inline
    def setMaxPreviousDeploymentArtifacts(value: Double | String): Self = StObject.set(x, "maxPreviousDeploymentArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPreviousDeploymentArtifactsUndefined: Self = StObject.set(x, "maxPreviousDeploymentArtifacts", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: String): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
    
    @scala.inline
    def setSseCustomerAlgorithim(value: String): Self = StObject.set(x, "sseCustomerAlgorithim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseCustomerAlgorithimUndefined: Self = StObject.set(x, "sseCustomerAlgorithim", js.undefined)
    
    @scala.inline
    def setSseCustomerKey(value: String): Self = StObject.set(x, "sseCustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseCustomerKeyMD5(value: String): Self = StObject.set(x, "sseCustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseCustomerKeyMD5Undefined: Self = StObject.set(x, "sseCustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setSseCustomerKeyUndefined: Self = StObject.set(x, "sseCustomerKey", js.undefined)
    
    @scala.inline
    def setSseKMSKeyId(value: String): Self = StObject.set(x, "sseKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseKMSKeyIdUndefined: Self = StObject.set(x, "sseKMSKeyId", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
