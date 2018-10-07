<?php

use Phalcon\Mvc\Micro;

$app = new Micro();
$app->notFound(function () use ($app) {
    $app->response->setStatusCode(404, "Not Found")->sendHeaders();
    echo 'Resource not found!';
});
$app->get(
    '/api/user',
    function () {
        $users = [
          ['id' => 1, 'login' => 'login1', 'fullName' => 'fullName1'],
          ['id' => 2, 'login' => 'login2', 'fullName' => 'fullName2']
        ];
        return json_encode($users);
    }
);
$app->get(
    '/api/customer',
    function () {
        $customers = [
          ['id' => 1, 'fullName' => 'fullName1', 'orders' => []],
          ['id' => 2, 'fullName' => 'fullName2', 'orders' => []]
        ];
        return json_encode($customers);
    }
);
$app->get(
    '/api/product',
    function () {
      $products = [
        ['id' => 1, 'name' => 'name1', 'price' => 0.0, 'cost' => 0.0, 'validUntil' => time()],
        ['id' => 2, 'name' => 'name2', 'price' => 0.0, 'cost' => 0.0, 'validUntil' => time()]
      ];
      return json_encode($products);
    }
);
$app->get(
    '/api/order',
    function () {
      $orders = [
        ['id' => 1, 'status' => 1, 'createdAt' => time(), 'customer' => 1, 'products' => [], 'deliveryTime' => time() * 2 ],
        ['id' => 2, 'status' => 1, 'createdAt' => time(), 'customer' => 1, 'products' => [], 'deliveryTime' => time() * 2]
      ];
      return json_encode($orders);
    }
);
$app->get(
    '/api/partner',
    function () {
      $partners = [
        ['id' => 1, 'name' => 'name1'],
        ['id' => 2, 'name' => 'name2']
      ];
      return json_encode($partners);
    }
);
$app->handle();
