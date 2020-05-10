package typingsSlinky.uiRouterExtras.mod.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState * / any */ @js.native
trait IStickyState extends js.Object {
  /*
    * The most-recently-activate substate of the DSR marked state is remembered.
    * When the DSR marked state is transitioned to directly, UI-Router Extras will instead redirect to the remembered state and parameters.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
    */
  var deepStateRedirect: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.native
  /*
    * Shortname deepStateRedirect prop
    */
  var dsr: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.native
  /*
    * Function (injectable). Called when a sticky state is navigated away from (inactivated).
    */
  var onInactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /*
    * Function (injectable). Called when an inactive sticky state is navigated to (reactivated).
    */
  var onReactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /*
    * When marking a state sticky, the state must target its own unique named ui-view.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/sticky
    */
  var sticky: js.UndefOr[Boolean] = js.native
  /*
    * Note: named views are mandatory when using sticky states!
    */
  var views: js.UndefOr[
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
    ]
  ] = js.native
}

object IStickyState {
  @scala.inline
  def apply(): IStickyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStickyState]
  }
  @scala.inline
  implicit class IStickyStateOps[Self <: IStickyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeepStateRedirect(value: Boolean | IDeepStateRedirectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepStateRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepStateRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepStateRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withDsr(value: Boolean | IDeepStateRedirectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsr")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInactivate(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReactivate(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(
      value: StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

