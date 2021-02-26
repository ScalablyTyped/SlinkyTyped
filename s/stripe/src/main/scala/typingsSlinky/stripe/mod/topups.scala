package typingsSlinky.stripe.mod

import typingsSlinky.stripe.anon.Gt
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.reversed
import typingsSlinky.stripe.stripeStrings.succeeded
import typingsSlinky.stripe.stripeStrings.topup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topups {
  
  type IAmountFilter = String | Gt
  
  @js.native
  trait ITopup extends IResourceObject {
    
    /**
      * Amount transferred
      */
    var amount: Double = js.native
    
    /**
      * ID of the balance transaction that describes the impact of this top-up on your account balance.
      * May not be specified depending on status of top-up.
      */
    var balance_transaction: String | Null = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: String = js.native
    
    /**
      * Date the funds are expected to arrive in your Stripe account for payouts. This factors in delays
      * like weekends or bank holidays. May not be specified depending on status of top-up.
      */
    var expected_availability_date: Double = js.native
    
    /**
      * Error code explaining reason for top-up failure if available
      */
    var failure_code: String | Null = js.native
    
    /**
      * Message to user further explaining reason for top-up failure if available.
      */
    var failure_message: String | Null = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists
      * in test mode.
      */
    var livemode: Boolean = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing
      * additional information about the object in a structured format.
      */
    var metaData: IMetadata = js.native
    
    /**
      * Value is "topup"
      */
    @JSName("object")
    var object_ITopup: topup = js.native
    
    /**
      * For most Stripe users, the source of every top-up is a bank account. This hash is then the
      * source object describing that bank account.
      */
    var source: ISource = js.native
    
    /**
      * Extra information about a top-up. This will appear on your source’s bank statement.
      * It must contain at least one letter.
      */
    var statement_descriptor: String | Null = js.native
    
    /**
      * Status of topup
      */
    var status: canceled | failed | pending | reversed | succeeded = js.native
    
    /**
      * A string that identifies this top-up as part of a group.
      */
    var transfer_group: String | Null = js.native
  }
  object ITopup {
    
    @scala.inline
    def apply(
      amount: Double,
      created: Double,
      currency: String,
      description: String,
      expected_availability_date: Double,
      id: String,
      livemode: Boolean,
      metaData: IMetadata,
      `object`: topup,
      source: ISource,
      status: canceled | failed | pending | reversed | succeeded
    ): ITopup = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected_availability_date = expected_availability_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopup]
    }
    
    @scala.inline
    implicit class ITopupMutableBuilder[Self <: ITopup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected_availability_date(value: Double): Self = StObject.set(x, "expected_availability_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_codeNull: Self = StObject.set(x, "failure_code", null)
      
      @scala.inline
      def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_messageNull: Self = StObject.set(x, "failure_message", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaData(value: IMetadata): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: topup): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: ISource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
      
      @scala.inline
      def setStatus(value: canceled | failed | pending | reversed | succeeded): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
    }
  }
  
  @js.native
  trait ITopupCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * A positive integer representing how much to transfer.
      */
    var amount: Double = js.native
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The ID of a source to transfer funds from. For most users, this should be left unspecified
      * which will use the bank account that was set up in the dashboard for the specified currency.
      * In test mode, this can be a test bank token (see https://stripe.com/docs/connect/testing#testing-top-ups).
      */
    var source: js.UndefOr[String] = js.native
    
    /**
      * Extra information about a top-up for the source’s bank statement. Limited to 15 ASCII characters.
      */
    var statement_descriptor: js.UndefOr[String] = js.native
    
    /**
      * A string that identifies this top-up as part of a group.
      */
    var transfer_group: js.UndefOr[String] = js.native
  }
  object ITopupCreationOptions {
    
    @scala.inline
    def apply(amount: Double, currency: String): ITopupCreationOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopupCreationOptions]
    }
    
    @scala.inline
    implicit class ITopupCreationOptionsMutableBuilder[Self <: ITopupCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      @scala.inline
      def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_groupUndefined: Self = StObject.set(x, "transfer_group", js.undefined)
    }
  }
  
  @js.native
  trait ITopupUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: js.UndefOr[String] = js.native
  }
  object ITopupUpdateOptions {
    
    @scala.inline
    def apply(): ITopupUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITopupUpdateOptions]
    }
    
    @scala.inline
    implicit class ITopupUpdateOptionsMutableBuilder[Self <: ITopupUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  @js.native
  trait ITopupsListOptions extends IListOptionsCreated {
    
    /**
      * A filter on the list based on the object amount field. The value can be a string with
      * an integer amount, or it can be a dictionary.
      */
    var amount: js.UndefOr[IAmountFilter] = js.native
    
    /**
      * Only return top-ups that have the given status.
      */
    var status: js.UndefOr[canceled | failed | pending | succeeded] = js.native
  }
  object ITopupsListOptions {
    
    @scala.inline
    def apply(): ITopupsListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITopupsListOptions]
    }
    
    @scala.inline
    implicit class ITopupsListOptionsMutableBuilder[Self <: ITopupsListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: IAmountFilter): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setStatus(value: canceled | failed | pending | succeeded): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
