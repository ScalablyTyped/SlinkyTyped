package typingsSlinky.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object awsProviderMod {
  type Authorizers = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.serverless.awsProviderMod.CognitoAuthorizer | typingsSlinky.serverless.awsProviderMod.OidcAuthorizer | typingsSlinky.serverless.awsProviderMod.JwtAuthorizer
  ]
  type CloudFormationResources = org.scalablytyped.runtime.StringDictionary[typingsSlinky.serverless.awsProviderMod.CloudFormationResource]
  type Custom = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Detail = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type Environment = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Functions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.serverless.awsProviderMod.AwsFunction]
  type Input = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Layers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.serverless.awsProviderMod.Layer]
  type Outputs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.serverless.awsProviderMod.Output]
  type Tags = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
