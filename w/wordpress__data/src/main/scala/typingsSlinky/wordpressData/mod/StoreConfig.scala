package typingsSlinky.wordpressData.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.std.Generator
import typingsSlinky.wordpressData.wordpressDataBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreConfig[S] extends js.Object {
  var actions: js.UndefOr[
    StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]]
  ] = js.native
  var controls: js.UndefOr[StringDictionary[js.Function1[/* action */ AnyAction, _]]] = js.native
  var initialState: js.UndefOr[S] = js.native
  /**
    * Use persist with the persistence plugin to persist state.
    *
    * The registry must use the `persistence` plugin.
    *
    * Set to `true` to persist all state, or pass an array of state keys to persist.
    *
    * @example
    *
    * import { plugins, registerStore, use } from '@wordpress/data';
    *
    * use( plugins.persistence, { storageKey: 'example' } );
    *
    * registerStore( 'my-plugin', {
    *   // …
    *   persist: [ 'state-key-to-persist' ],
    * } );
    */
  var persist: js.UndefOr[`true` | (js.Array[/* keyof S */ String])] = js.native
  var reducer: Reducer[S, AnyAction] = js.native
  var resolvers: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.native
  var selectors: js.UndefOr[StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]] = js.native
}

object StoreConfig {
  @scala.inline
  def apply[S](reducer: (/* state */ js.UndefOr[S], AnyAction) => S): StoreConfig[S] = {
    val __obj = js.Dynamic.literal(reducer = js.Any.fromFunction2(reducer))
    __obj.asInstanceOf[StoreConfig[S]]
  }
  @scala.inline
  implicit class StoreConfigOps[Self[s] <: StoreConfig[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withReducer(value: (/* state */ js.UndefOr[S], AnyAction) => S): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withActions(value: StringDictionary[js.Function1[/* repeated */ js.Any, AnyAction | (Generator[_, _, _])]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: StringDictionary[js.Function1[/* action */ AnyAction, _]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: S): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: `true` | (js.Array[/* keyof S */ String])): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvers(value: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: StringDictionary[js.Function2[/* state */ S, /* repeated */ js.Any, _]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
  }
  
}

