package typingsSlinky.vuex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Action[S, R] = (typingsSlinky.vuex.mod.ActionHandler[S, R]) | (typingsSlinky.vuex.mod.ActionObject[S, R])
  
  type ActionErrorSubscriber[P, S] = js.Function3[/* action */ P, /* state */ S, /* error */ js.Error, js.Any]
  
  type ActionHandler[S, R] = js.ThisFunction2[
    /* this */ typingsSlinky.vuex.mod.Store[R], 
    /* injectee */ typingsSlinky.vuex.mod.ActionContext[S, R], 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type ActionSubscriber[P, S] = js.Function2[/* action */ P, /* state */ S, js.Any]
  
  type ActionTree[S, R] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.vuex.mod.Action[S, R]]
  
  type Getter[S, R] = js.Function4[/* state */ S, /* getters */ js.Any, /* rootState */ R, /* rootGetters */ js.Any, js.Any]
  
  type GetterTree[S, R] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.vuex.mod.Getter[S, R]]
  
  type ModuleTree[R] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.vuex.mod.Module[js.Any, R]]
  
  type Mutation[S] = js.Function2[/* state */ S, /* payload */ js.UndefOr[js.Any], js.Any]
  
  type MutationTree[S] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.vuex.mod.Mutation[S]]
  
  type Plugin[S] = js.Function1[/* store */ typingsSlinky.vuex.mod.Store[S], js.Any]
  
  type SubscribeActionOptions[P, S] = (typingsSlinky.vuex.mod.ActionSubscriber[P, S]) | (typingsSlinky.vuex.mod.ActionSubscribersObject[P, S])
}
