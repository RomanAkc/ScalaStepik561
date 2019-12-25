Right(1)
  .flatMap(_ => Right(2))
  .flatMap(_ => Right(3))

Right(1)
  .flatMap(_ => Left(2))
  .flatMap(_ => Left(3))