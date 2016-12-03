package com.flipkart.phantom.simple.http;

import com.flipkart.kloud.authn.PrivateKeyCredential;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by adarsh.singh on 01/12/16.
 */
public class PrivateKeyCredentialImpl {

  public static PrivateKeyCredential getPrivateKeyCredential(String clientId, String filePath)
      throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
    return PrivateKeyCredential.fromPemFile(clientId, filePath);
  }
}