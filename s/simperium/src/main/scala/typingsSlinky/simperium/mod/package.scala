package typingsSlinky.simperium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def default[Buckets](appID: java.lang.String, token: java.lang.String): typingsSlinky.simperium.mod.Client[Buckets] = (typingsSlinky.simperium.mod.^.asInstanceOf[js.Dynamic].applyDynamic("default")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.simperium.mod.Client[Buckets]]
  @scala.inline
  def default[Buckets](
    appID: java.lang.String,
    token: java.lang.String,
    clientConfig: typingsSlinky.std.Partial[typingsSlinky.simperium.mod.ClientConfig[Buckets]]
  ): typingsSlinky.simperium.mod.Client[Buckets] = (typingsSlinky.simperium.mod.^.asInstanceOf[js.Dynamic].applyDynamic("default")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.simperium.mod.Client[Buckets]]
  
  @scala.inline
  def Auth(appId: java.lang.String, apiKey: java.lang.String): typingsSlinky.simperium.anon.Authorize = (typingsSlinky.simperium.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Auth")(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.simperium.anon.Authorize]
  
  type ChangeVersion = java.lang.String
  
  type DMPDiff = java.lang.String
  
  type EntitiesCallback[T, E] = js.Function2[
    /* error */ typingsSlinky.std.NonNullable[E] | scala.Null, 
    /* entities */ js.UndefOr[js.Array[T]], 
    scala.Unit
  ]
  
  type EntityCallback[T, E] = js.Function2[
    /* error */ typingsSlinky.std.NonNullable[E] | scala.Null, 
    /* entity */ js.UndefOr[T], 
    scala.Unit
  ]
  
  type EntityId = java.lang.String
  
  type Heartbeat = typingsSlinky.simperium.mod.CustomEventEmitter[typingsSlinky.simperium.mod.HeartbeatEvent]
  
  type JSONDiff[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? simperium.simperium.DiffOp<T[K]>}
    */ typingsSlinky.simperium.simperiumStrings.JSONDiff with org.scalablytyped.runtime.TopLevel[T]
  
  type LocalQueue[T] = typingsSlinky.simperium.mod.CustomEventEmitter[typingsSlinky.simperium.mod.LocalQueueEvent[T]]
  
  type SimperiumEvent = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  @scala.inline
  def createClient[Buckets](appID: java.lang.String, token: java.lang.String): typingsSlinky.simperium.mod.Client[Buckets] = (typingsSlinky.simperium.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.simperium.mod.Client[Buckets]]
  @scala.inline
  def createClient[Buckets](
    appID: java.lang.String,
    token: java.lang.String,
    clientConfig: typingsSlinky.std.Partial[typingsSlinky.simperium.mod.ClientConfig[Buckets]]
  ): typingsSlinky.simperium.mod.Client[Buckets] = (typingsSlinky.simperium.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.simperium.mod.Client[Buckets]]
}
