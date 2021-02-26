package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderResult extends StObject {
  
  /**
    * This is the set of data providers that were requested, but either they were defined as client providers, or as remote providers that failed and may be retried by the client.
    */
  var clientProviders: StringDictionary[ClientDataProviderQuery] = js.native
  
  /**
    * Property bag of data keyed off of the data provider contribution id
    */
  var data: StringDictionary[js.Any] = js.native
  
  /**
    * Set of exceptions that occurred resolving the data providers.
    */
  var exceptions: StringDictionary[DataProviderExceptionDetails] = js.native
  
  /**
    * List of data providers resolved in the data-provider query
    */
  var resolvedProviders: js.Array[ResolvedDataProvider] = js.native
  
  /**
    * Scope name applied to this data provider result.
    */
  var scopeName: String = js.native
  
  /**
    * Scope value applied to this data provider result.
    */
  var scopeValue: String = js.native
  
  /**
    * Property bag of shared data that was contributed to by any of the individual data providers
    */
  var sharedData: StringDictionary[js.Any] = js.native
}
object DataProviderResult {
  
  @scala.inline
  def apply(
    clientProviders: StringDictionary[ClientDataProviderQuery],
    data: StringDictionary[js.Any],
    exceptions: StringDictionary[DataProviderExceptionDetails],
    resolvedProviders: js.Array[ResolvedDataProvider],
    scopeName: String,
    scopeValue: String,
    sharedData: StringDictionary[js.Any]
  ): DataProviderResult = {
    val __obj = js.Dynamic.literal(clientProviders = clientProviders.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], exceptions = exceptions.asInstanceOf[js.Any], resolvedProviders = resolvedProviders.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], scopeValue = scopeValue.asInstanceOf[js.Any], sharedData = sharedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderResult]
  }
  
  @scala.inline
  implicit class DataProviderResultMutableBuilder[Self <: DataProviderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientProviders(value: StringDictionary[ClientDataProviderQuery]): Self = StObject.set(x, "clientProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptions(value: StringDictionary[DataProviderExceptionDetails]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedProviders(value: js.Array[ResolvedDataProvider]): Self = StObject.set(x, "resolvedProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedProvidersVarargs(value: ResolvedDataProvider*): Self = StObject.set(x, "resolvedProviders", js.Array(value :_*))
    
    @scala.inline
    def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeValue(value: String): Self = StObject.set(x, "scopeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedData(value: StringDictionary[js.Any]): Self = StObject.set(x, "sharedData", value.asInstanceOf[js.Any])
  }
}
