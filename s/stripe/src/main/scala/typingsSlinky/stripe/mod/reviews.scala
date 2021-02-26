package typingsSlinky.stripe.mod

import typingsSlinky.stripe.mod.charges.ICharge
import typingsSlinky.stripe.stripeStrings.approved
import typingsSlinky.stripe.stripeStrings.disputed
import typingsSlinky.stripe.stripeStrings.manual
import typingsSlinky.stripe.stripeStrings.refunded
import typingsSlinky.stripe.stripeStrings.refunded_as_fraud
import typingsSlinky.stripe.stripeStrings.review
import typingsSlinky.stripe.stripeStrings.rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reviews {
  
  @js.native
  trait IReview extends IResourceObject {
    
    /**
      * The charge associated with this review. [Expandable]
      */
    var charge: String | ICharge = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean = js.native
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_IReview: review = js.native
    
    /**
      * If true, the review needs action.
      */
    var open: Boolean = js.native
    
    /**
      * The reason the review is currently open or closed.
      */
    var reason: rule | manual | approved | refunded | refunded_as_fraud | disputed = js.native
  }
  object IReview {
    
    @scala.inline
    def apply(
      charge: String | ICharge,
      created: Double,
      id: String,
      livemode: Boolean,
      `object`: review,
      open: Boolean,
      reason: rule | manual | approved | refunded | refunded_as_fraud | disputed
    ): IReview = {
      val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReview]
    }
    
    @scala.inline
    implicit class IReviewMutableBuilder[Self <: IReview] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharge(value: String | ICharge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: review): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: rule | manual | approved | refunded | refunded_as_fraud | disputed): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
