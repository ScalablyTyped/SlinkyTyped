package typingsSlinky.sparkpost.anon

import typingsSlinky.sparkpost.mod.Callback
import typingsSlinky.sparkpost.mod.CreateSendingDomain
import typingsSlinky.sparkpost.mod.ResultsCallback
import typingsSlinky.sparkpost.mod.ResultsPromise
import typingsSlinky.sparkpost.mod.SendingDomain
import typingsSlinky.sparkpost.mod.UpdateSendingDomain
import typingsSlinky.sparkpost.mod.VerifyOptions
import typingsSlinky.sparkpost.mod.VerifyResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  /**
    * Create a sending domain by providing a sending domain object as the POST request body.
    *
    * @param options The create options
    * @returns Promise The basic info results
    */
  def create(options: CreateSendingDomain): ResultsPromise[Domain] = js.native
  /**
    * Create a sending domain by providing a sending domain object as the POST request body.
    * @param options The create options
    * @param callback The request callback with basic info results
    */
  def create(options: CreateSendingDomain, callback: ResultsCallback[Domain]): Unit = js.native
  
  /**
    * Delete an existing sending domain.
    *
    * @param domain The domain
    * @returns Promise void
    */
  def delete(domain: String): js.Promise[Unit] = js.native
  /**
    * Delete an existing sending domain.
    * @param domain The domain
    * @param callback The request callback
    */
  def delete(domain: String, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Retrieve a sending domain by specifying its domain name in the URI path. The response includes details about its DKIM key configuration.
    *
    * @param domain The domain
    * @returns Promise The SendingDomain results
    */
  def get(domain: String): ResultsPromise[SendingDomain] = js.native
  /**
    * Retrieve a sending domain by specifying its domain name in the URI path. The response includes details about its DKIM key configuration.
    * @param domain The domain
    * @param callback The request callback with SendingDomain results
    */
  def get(domain: String, callback: ResultsCallback[SendingDomain]): Unit = js.native
  
  /**
    * List an overview of all sending domains in the system.
    *
    * @returns The SendingDomain results array
    */
  def list(): ResultsPromise[js.Array[SendingDomain]] = js.native
  /**
    * List an overview of all sending domains in the system.
    * @param callback The request callback with SendingDomain results array
    */
  def list(callback: ResultsCallback[js.Array[SendingDomain]]): Unit = js.native
  
  /**
    * Update the attributes of an existing sending domain by specifying its domain name in the URI path and use a sending domain object as the PUT request body.
    *
    * @param domain The domain
    * @param updateOpts The update options
    * @returns Promise The basic info results
    */
  def update(domain: String, updateOpts: UpdateSendingDomain): ResultsPromise[Domain] = js.native
  /**
    * Update the attributes of an existing sending domain by specifying its domain name in the URI path and use a sending domain object as the PUT request body.
    * @param domain The domain
    * @param updateOpts The update options
    * @param callback The request callback with basic info results
    */
  def update(domain: String, updateOpts: UpdateSendingDomain, callback: ResultsCallback[Domain]): Unit = js.native
  
  /**
    * Verify a Sending Domain
    *
    * @param domain The domain
    * @param options a hash of [verify attributes]{@link https://developers.sparkpost.com/api/sending-domains#header-verify-attributes}
    * @returns Promise The verify results
    */
  def verify(domain: String, options: VerifyOptions): ResultsPromise[VerifyResults] = js.native
  /**
    * Verify a Sending Domain
    * @param domain The domain
    * @param options a hash of [verify attributes]{@link https://developers.sparkpost.com/api/sending-domains#header-verify-attributes}
    * @param callback The request callback with verify results
    */
  def verify(domain: String, options: VerifyOptions, callback: ResultsCallback[VerifyResults]): Unit = js.native
}
